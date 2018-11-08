package com.rn.supera.client;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.rn.supera.ws.typed.base.ActionEnum;
import com.rn.supera.ws.typed.base.ID;
import com.rn.supera.ws.typed.base.NamedID;
import com.rn.supera.ws.typed.generic.DataTypeEnum;
import com.rn.supera.ws.typed.generic.DataValue;
import com.rn.supera.ws.typed.generic.GenericField;
import com.rn.supera.ws.typed.generic.GenericObject;
import com.rn.supera.ws.typed.objects.Address;
import com.rn.supera.ws.typed.objects.Contact;
import com.rn.supera.ws.typed.objects.Email;
import com.rn.supera.ws.typed.objects.EmailList;
import com.rn.supera.ws.typed.objects.Organization;
import com.rn.supera.ws.typed.objects.PersonName;
import com.rn.supera.ws.typed.objects.Phone;
import com.rn.supera.ws.typed.objects.PhoneList;
import com.rn.supera.ws.typed.objects.TypedAddress;
import com.rn.supera.ws.typed.objects.TypedAddressList;
import com.rn.supera.ws.typed.wsdl.RequestErrorFault;
import com.rn.supera.ws.typed.wsdl.ServerErrorFault;
import com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault;
import com.rn.supera.ws.typed.generic.RNObjectType;

public class Conversor {

  public static Organization toOrganization(SuperaLogger logger, int i, int tamanhoLista,
      String[] arrayCamposOrganization) throws IOException {

    if (!arrayCamposOrganization[0].isEmpty()) {
      // Instâncias de dependências
      Organization organization = new Organization();
      GenericObject genericObject = new GenericObject();
      List<GenericField> gfs = new ArrayList<GenericField>();

      // Criando tipos de endereços
      TypedAddressList tiposEnderecos = new TypedAddressList();
      TypedAddress enderecoCobranca = new TypedAddress();
      TypedAddress enderecoRemessa = new TypedAddress();

      enderecoCobranca.setAction(ActionEnum.add);
      enderecoRemessa.setAction(ActionEnum.add);

      NamedID cobrancaNamedID = new NamedID();
      ID cobrancaID = new ID();
      cobrancaID.setId(1L);
      cobrancaNamedID.setID(cobrancaID);
      enderecoCobranca.setAddressType(cobrancaNamedID);

      NamedID entregaNamedID = new NamedID();
      ID entregaID = new ID();
      entregaID.setId(2L);
      entregaNamedID.setID(entregaID);
      enderecoRemessa.setAddressType(entregaNamedID);

      // Nome Cliente
      organization.setName(arrayCamposOrganization[0]);

      // Endereço
      if (!arrayCamposOrganization[1].isEmpty()) {
        enderecoCobranca.setStreet(arrayCamposOrganization[1]);
      }

      // Cidade
      if (!arrayCamposOrganization[2].isEmpty()) {
        enderecoCobranca.setCity(arrayCamposOrganization[2]);
      }

      // Pais
      NamedID paisCobrancaNamedId = new NamedID();
      ID paisCobrancaId = new ID();
      paisCobrancaId.setId(2L);
      paisCobrancaNamedId.setID(paisCobrancaId);
      enderecoCobranca.setCountry(paisCobrancaNamedId);

      // Estado
      try {

        if (!arrayCamposOrganization[4].isEmpty()) {
          NamedID estadoCobrancaNamedId = new NamedID();
          ID estadoCobrancaId = new ID();
          estadoCobrancaId
              .setId(Long.parseLong(StateOrProvinceMap.getMap().get(arrayCamposOrganization[4].toUpperCase())));
          estadoCobrancaNamedId.setID(estadoCobrancaId);
          enderecoCobranca.setStateOrProvince(estadoCobrancaNamedId);
        }

      }

      catch (NumberFormatException e) {
        String mensagem = "O Estado de Cobrança da Organização " + arrayCamposOrganization[0] + " é inválido.";
        logger.erroArquivo(new Date(), mensagem);
        logger.erroConsole(new Date(), mensagem);
      }

      // Cep
      if (!arrayCamposOrganization[5].isEmpty()) {
        enderecoCobranca.setPostalCode(arrayCamposOrganization[5]);
      }

      // Endereço Entrega

      if (!arrayCamposOrganization[6].isEmpty()) {
        enderecoRemessa.setStreet(arrayCamposOrganization[6]);
      }

      // Cidade Entrega
      if (!arrayCamposOrganization[7].isEmpty()) {
        enderecoRemessa.setCity(arrayCamposOrganization[7]);
      }

      // Pais Entrega
      NamedID paisRemessaNamedId = new NamedID();
      ID paisRemessaId = new ID();
      paisRemessaId.setId(2L);
      paisRemessaNamedId.setID(paisRemessaId);
      enderecoRemessa.setCountry(paisRemessaNamedId);

      // Estado Entrega
      try {

        if (!arrayCamposOrganization[9].isEmpty()) {
          NamedID estadoRemessaNamedId = new NamedID();
          ID estadoRemessaId = new ID();
          estadoRemessaId
              .setId(Long.parseLong(StateOrProvinceMap.getMap().get(arrayCamposOrganization[9].toUpperCase())));
          estadoRemessaNamedId.setID(estadoRemessaId);
          enderecoRemessa.setStateOrProvince(estadoRemessaNamedId);
        }

      }

      catch (NumberFormatException e) {
        String mensagem = "O Estado de Entrega da Organização " + arrayCamposOrganization[0] + " é inválido.";
        logger.erroArquivo(new Date(), mensagem);
        logger.erroArquivo(new Date(), mensagem);
      }

      // Cep Entrega
      if (!arrayCamposOrganization[10].isEmpty()) {
        enderecoRemessa.setPostalCode(arrayCamposOrganization[10]);
      }

      // Inscrição Estadual
      if (!arrayCamposOrganization[11].isEmpty()) {
        GenericField inscEstGenericField = criarGenericField("inscr_estad",
            criarStringDataValue(arrayCamposOrganization[11]), DataTypeEnum.STRING);
        DataValue inscEstDataValue = new DataValue();
        GenericObject inscEstGenericObject = new GenericObject();
        inscEstGenericObject.addGenericFields(inscEstGenericField);
        inscEstDataValue.setObjectValue(inscEstGenericObject);
        gfs.add(criarGenericField("c", inscEstDataValue, DataTypeEnum.OBJECT));
      }

      // CGC
      if (!arrayCamposOrganization[12].isEmpty()) {
        GenericField cgcGenericField = criarGenericField("cnpj", criarStringDataValue(arrayCamposOrganization[12]),
            DataTypeEnum.STRING);
        DataValue cgcDataValue = new DataValue();
        GenericObject cgcGenericObject = new GenericObject();
        cgcGenericObject.addGenericFields(cgcGenericField);
        cgcDataValue.setObjectValue(cgcGenericObject);
        gfs.add(criarGenericField("c", cgcDataValue, DataTypeEnum.OBJECT));
      }

      // E-mail
      if (!arrayCamposOrganization[13].isEmpty()) {
        GenericField emailGenericField = criarGenericField("email", criarStringDataValue(arrayCamposOrganization[13]),
            DataTypeEnum.STRING);
        DataValue emailDataValue = new DataValue();
        GenericObject emailGenericObject = new GenericObject();
        emailGenericObject.addGenericFields(emailGenericField);
        emailDataValue.setObjectValue(emailGenericObject);
        gfs.add(criarGenericField("c", emailDataValue, DataTypeEnum.OBJECT));
      }

      // Telefone 1
      if (!arrayCamposOrganization[14].isEmpty()) {
        GenericField telefone1GenericField = criarGenericField("telefone_1",
            criarStringDataValue(arrayCamposOrganization[14]), DataTypeEnum.STRING);
        DataValue telefone1DataValue = new DataValue();
        GenericObject telefone1GenericObject = new GenericObject();
        telefone1GenericObject.addGenericFields(telefone1GenericField);
        telefone1DataValue.setObjectValue(telefone1GenericObject);
        gfs.add(criarGenericField("c", telefone1DataValue, DataTypeEnum.OBJECT));
      }

      // Telefone 2
      if (!arrayCamposOrganization[15].isEmpty()) {
        GenericField telefone2GenericField = criarGenericField("telefone_2",
            criarStringDataValue(arrayCamposOrganization[15]), DataTypeEnum.STRING);
        DataValue telefone2DataValue = new DataValue();
        GenericObject telefone2GenericObject = new GenericObject();
        telefone2GenericObject.addGenericFields(telefone2GenericField);
        telefone2DataValue.setObjectValue(telefone2GenericObject);
        gfs.add(criarGenericField("c", telefone2DataValue, DataTypeEnum.OBJECT));
      }

      // Carregando objeto
      TypedAddress[] typedAddressArray = { enderecoCobranca, enderecoRemessa };
      tiposEnderecos.setTypedAddressList(typedAddressArray);
      organization.setAddresses(tiposEnderecos);
      genericObject.setGenericFields(gfs.toArray(new GenericField[gfs.size()]));
      organization.setCustomFields(genericObject);
      return organization;
    }

    else {
      String mensagem = "Não foi possível carregar Cliente porque o campo obrigatório \"Nome da Organização\" não foi preenchido. ["
          + i + " de " + tamanhoLista + "] (CGC: " + arrayCamposOrganization[12] + ")";
      logger.erroArquivo(new Date(), mensagem);
      logger.erroConsole(new Date(), mensagem);
      return null;
    }

  }

  public static Contact toContact(SuperaLogger logger, int i, int tamanhoLista, String[] arrayCamposContact)
      throws ParseException, IOException {

    if (!arrayCamposContact[0].isEmpty() || !arrayCamposContact[1].isEmpty()) {
      Contact contato = new Contact();
      GenericObject genericObject = new GenericObject();
      List<GenericField> gfs = new ArrayList<GenericField>();

      // Nome
      PersonName personName = new PersonName();
      personName.setFirst(arrayCamposContact[0]);

      // Sobrenome
      personName.setLast(arrayCamposContact[1]);

      // CGC
      if (!arrayCamposContact[2].isEmpty()) {
        GenericField cgcGenericField = criarGenericField("cpf", criarStringDataValue(arrayCamposContact[2]),
            DataTypeEnum.STRING);
        DataValue cgcDataValue = new DataValue();
        GenericObject cgcGenericObject = new GenericObject();
        cgcGenericObject.addGenericFields(cgcGenericField);
        cgcDataValue.setObjectValue(cgcGenericObject);
        gfs.add(criarGenericField("c", cgcDataValue, DataTypeEnum.OBJECT));
      }

      // RG
      if (!arrayCamposContact[3].isEmpty()) {
        GenericField rgGenericField = criarGenericField("rg", criarStringDataValue(arrayCamposContact[3]),
            DataTypeEnum.STRING);
        DataValue rgDataValue = new DataValue();
        GenericObject rgGenericObject = new GenericObject();
        rgGenericObject.addGenericFields(rgGenericField);
        rgDataValue.setObjectValue(rgGenericObject);
        gfs.add(criarGenericField("c", rgDataValue, DataTypeEnum.OBJECT));
      }

      // Núm. Conselho
      if (!arrayCamposContact[4].isEmpty()) {
        GenericField conselhoGenericField = criarGenericField("numero_do_conselho",
            criarStringDataValue(arrayCamposContact[4]), DataTypeEnum.STRING);
        DataValue conselhoDataValue = new DataValue();
        GenericObject conselhoGenericObject = new GenericObject();
        conselhoGenericObject.addGenericFields(conselhoGenericField);
        conselhoDataValue.setObjectValue(conselhoGenericObject);
        gfs.add(criarGenericField("c", conselhoDataValue, DataTypeEnum.OBJECT));
      }

      // Empresa
      if (!arrayCamposContact[5].isEmpty()) {
        GenericField empresaGenericField = criarGenericField("empresa", criarStringDataValue(arrayCamposContact[5]),
            DataTypeEnum.STRING);
        DataValue empresaDataValue = new DataValue();
        GenericObject empresaGenericObject = new GenericObject();
        empresaGenericObject.addGenericFields(empresaGenericField);
        empresaDataValue.setObjectValue(empresaGenericObject);
        gfs.add(criarGenericField("c", empresaDataValue, DataTypeEnum.OBJECT));
      }

      // Estabelecimento
      if (!arrayCamposContact[6].isEmpty()) {
        GenericField estabelecimentoGenericField = criarGenericField("estabelecimento",
            criarStringDataValue(arrayCamposContact[6]), DataTypeEnum.STRING);
        DataValue estabelecimentoDataValue = new DataValue();
        GenericObject estabelecimentoGenericObject = new GenericObject();
        estabelecimentoGenericObject.addGenericFields(estabelecimentoGenericField);
        estabelecimentoDataValue.setObjectValue(estabelecimentoGenericObject);
        gfs.add(criarGenericField("c", estabelecimentoDataValue, DataTypeEnum.OBJECT));
      }

      // Matricula
      if (!arrayCamposContact[7].isEmpty()) {
        GenericField matriculaGenericField = criarGenericField("matricula_funcionario",
            criarStringDataValue(arrayCamposContact[7]), DataTypeEnum.STRING);
        DataValue matriculaDataValue = new DataValue();
        GenericObject matriculaGenericObject = new GenericObject();
        matriculaGenericObject.addGenericFields(matriculaGenericField);
        matriculaDataValue.setObjectValue(matriculaGenericObject);
        gfs.add(criarGenericField("c", matriculaDataValue, DataTypeEnum.OBJECT));
      }

      // Email
      if (!arrayCamposContact[8].isEmpty()) {
        Email email = new Email();
        email.setAction(ActionEnum.add);
        email.setAddress(arrayCamposContact[8]);
        NamedID emailNamedID = new NamedID();
        ID emailId = new ID();
        emailId.setId(0L);
        emailNamedID.setID(emailId);
        email.setAddressType(emailNamedID);
        EmailList emails = new EmailList();
        emails.setEmailList(new Email[] { email });
        contato.setEmails(emails);
      }

      // Telefone
      if (!arrayCamposContact[9].isEmpty()) {
        Phone phone = new Phone();
        phone.setAction(ActionEnum.add);
        phone.setNumber(arrayCamposContact[9]);
        NamedID phoneNamedID = new NamedID();
        ID phoneId = new ID();
        phoneId.setId(0L);
        phoneNamedID.setID(phoneId);
        phone.setPhoneType(phoneNamedID);
        PhoneList phoneList = new PhoneList();
        phoneList.setPhoneList(new Phone[] { phone });
        contato.setPhones(phoneList);
      }

      // Ramal
      if (!arrayCamposContact[13].isEmpty()) {
        GenericField ramalGenericField = criarGenericField("ramal", criarStringDataValue(arrayCamposContact[13]),
            DataTypeEnum.STRING);
        DataValue ramalDataValue = new DataValue();
        GenericObject ramalGenericObject = new GenericObject();
        ramalGenericObject.addGenericFields(ramalGenericField);
        ramalDataValue.setObjectValue(ramalGenericObject);
        gfs.add(criarGenericField("c", ramalDataValue, DataTypeEnum.OBJECT));
      }

      // Endereço
      Address address = new Address();

      if (!arrayCamposContact[14].isEmpty()) {
        address.setStreet(arrayCamposContact[14]);
      }

      // Cidade
      if (!arrayCamposContact[15].isEmpty()) {
        address.setCity(arrayCamposContact[15]);
      }

      // País
      NamedID countrynamedId = new NamedID();
      ID countryId = new ID();
      countryId.setId(2L);
      countrynamedId.setID(countryId);
      address.setCountry(countrynamedId);

      // Estado
      try {

        if (!arrayCamposContact[17].isEmpty()) {
          NamedID stateNamedID = new NamedID();
          ID stateId = new ID();
          Map<String, String> stateOrProvinceMap = StateOrProvinceMap.getMap();
          stateId.setId(Long.parseLong(stateOrProvinceMap.get(arrayCamposContact[17].toUpperCase())));
          stateNamedID.setID(stateId);
          address.setStateOrProvince(stateNamedID);
        }

      }

      catch (NumberFormatException e) {
        String mensagem = "O Estado de Cobrança da Organização " + arrayCamposContact[2] + " é inválido.";
        logger.erroArquivo(new Date(), mensagem);
        logger.erroConsole(new Date(), mensagem);
      }

      // CEP
      if (!arrayCamposContact[18].isEmpty()) {
        address.setPostalCode(arrayCamposContact[18]);
      }

      // Tipo Contato
      if (!arrayCamposContact[19].isEmpty()) {
        NamedID tipoNamedId = new NamedID();
        ID tipoId = new ID();
        Map<String, String> tipoContatoMap = TipoContatoMap.getMap();
        tipoId.setId(Long.parseLong(tipoContatoMap.get(arrayCamposContact[19])));
        tipoNamedId.setID(tipoId);
        contato.setContactType(tipoNamedId);
      }

      // Organização
      if (arrayCamposContact[19].equals("Funcionario")) {
        NamedID organizacaoNamedID = new NamedID();
        ID organizacaoID = new ID();
        organizacaoID.setId(1L);
        organizacaoNamedID.setID(organizacaoID);
        contato.setOrganization(organizacaoNamedID);
      }

      // GR/GD/PV
      if (!arrayCamposContact[21].isEmpty()) {
        DataValue grGdPvDV = new DataValue();
        NamedID grGdPvNamedId = new NamedID();
        ID grGdPvIid = new ID();
        grGdPvIid.setId(Long.parseLong(GrGdPvMap.getMap().get(arrayCamposContact[21])));
        grGdPvNamedId.setID(grGdPvIid);
        grGdPvDV.setNamedIDValue(grGdPvNamedId);
        GenericField grGdPvGenericField = criarGenericField("gr_gd_pv", grGdPvDV, DataTypeEnum.NAMED_ID);
        DataValue grGdPvDataValue = new DataValue();
        GenericObject grGdPvGenericObject = new GenericObject();
        grGdPvGenericObject.addGenericFields(grGdPvGenericField);
        grGdPvDataValue.setObjectValue(grGdPvGenericObject);
        gfs.add(criarGenericField("c", grGdPvDataValue, DataTypeEnum.OBJECT));
      }

      // Pref. Contato
      DataValue prefContatoDV = new DataValue();
      NamedID prefContatoNamedId = new NamedID();
      ID prefContatoId = new ID();

      if (!arrayCamposContact[23].isEmpty()) {
        prefContatoId.setId(4);
      }

      else {
        prefContatoId.setId(5);
      }

      prefContatoNamedId.setID(prefContatoId);
      prefContatoDV.setNamedIDValue(prefContatoNamedId);
      GenericField prefContatoGenericField = criarGenericField("preferencia_de_contato", prefContatoDV,
          DataTypeEnum.NAMED_ID);
      DataValue prefContatoDataValue = new DataValue();
      GenericObject prefContatoGenericObject = new GenericObject();
      prefContatoGenericObject.addGenericFields(prefContatoGenericField);
      prefContatoDataValue.setObjectValue(prefContatoGenericObject);
      gfs.add(criarGenericField("c", prefContatoDataValue, DataTypeEnum.OBJECT));

      // Cargo
      if (!arrayCamposContact[22].isEmpty()) {
        contato.setTitle(arrayCamposContact[22]);
      }

      // Banco
      if (!arrayCamposContact[24].isEmpty()) {
        GenericField bancoGenericField = criarGenericField("banco", criarStringDataValue(arrayCamposContact[24]),
            DataTypeEnum.STRING);
        DataValue bancoDataValue = new DataValue();
        GenericObject bancoGenericObject = new GenericObject();
        bancoGenericObject.addGenericFields(bancoGenericField);
        bancoDataValue.setObjectValue(bancoGenericObject);
        gfs.add(criarGenericField("c", bancoDataValue, DataTypeEnum.OBJECT));
      }

      // Agência
      if (!arrayCamposContact[25].isEmpty()) {
        GenericField agenciaGenericField = criarGenericField("agencia", criarStringDataValue(arrayCamposContact[25]),
            DataTypeEnum.STRING);
        DataValue agenciaDataValue = new DataValue();
        GenericObject agenciaGenericObject = new GenericObject();
        agenciaGenericObject.addGenericFields(agenciaGenericField);
        agenciaDataValue.setObjectValue(agenciaGenericObject);
        gfs.add(criarGenericField("c", agenciaDataValue, DataTypeEnum.OBJECT));
      }

      // Conta Corrente
      if (!arrayCamposContact[26].isEmpty()) {
        GenericField ccGenericField = criarGenericField("conta_corrente", criarStringDataValue(arrayCamposContact[26]),
            DataTypeEnum.STRING);
        DataValue ccDataValue = new DataValue();
        GenericObject ccGenericObject = new GenericObject();
        ccGenericObject.addGenericFields(ccGenericField);
        ccDataValue.setObjectValue(ccGenericObject);
        gfs.add(criarGenericField("c", ccDataValue, DataTypeEnum.OBJECT));
      }

      // Data de Nascimento
      if (!arrayCamposContact[28].isEmpty()) {
        Date nasc = new SimpleDateFormat("dd/MM/yyyy").parse(arrayCamposContact[28]);
        GenericField nascGenericField = criarGenericField("DataNascimento", criarDateDataValue(nasc),
            DataTypeEnum.DATE);
        DataValue nascDataValue = new DataValue();
        GenericObject nascGenericObject = new GenericObject();
        nascGenericObject.addGenericFields(nascGenericField);
        nascDataValue.setObjectValue(nascGenericObject);
        gfs.add(criarGenericField("CO", nascDataValue, DataTypeEnum.OBJECT));
      }

      // Setor
      if (!arrayCamposContact[33].isEmpty()) {
        GenericField setorGenericField = criarGenericField("setor", criarStringDataValue(arrayCamposContact[33]),
            DataTypeEnum.STRING);
        DataValue setorDataValue = new DataValue();
        GenericObject setorGenericObject = new GenericObject();
        setorGenericObject.addGenericFields(setorGenericField);
        setorDataValue.setObjectValue(setorGenericObject);
        gfs.add(criarGenericField("c", setorDataValue, DataTypeEnum.OBJECT));
      }

      // Carregando objeto
      contato.setName(personName);
      contato.setAddress(address);
      genericObject.setGenericFields(gfs.toArray(new GenericField[gfs.size()]));
      contato.setCustomFields(genericObject);
      return contato;
    }

    else {
      String mensagem = "Não foi possível carregar Funcionário porque o campo obrigatório \"Nome\" não foi preenchido. ["
          + i + " de " + tamanhoLista + "] (Matrícula do Funcionário: " + arrayCamposContact[7] + ")";
      logger.erroArquivo(new Date(), mensagem);
      logger.erroConsole(new Date(), mensagem);
      return null;
    }

  }

  public static GenericObject toLote(SuperaLogger logger, int i, int tamanhoLista, String[] arrayCamposLote)
      throws ParseException, RequestErrorFault, UnexpectedErrorFault, ServerErrorFault, IOException {

    if (!arrayCamposLote[0].isEmpty()) {
      GenericObject genericObject = new GenericObject();
      List<GenericField> gfs = new ArrayList<GenericField>();
      RNObjectType objType = new RNObjectType();
      objType.setNamespace("CO");
      objType.setTypeName("Lote");
      genericObject.setObjectType(objType);

      // Cód. Item
      RNClient rnClient = new RNClient("integrador", "Supera123@");
      DataValue codItemDataValue = new DataValue();
      NamedID codItemNamedID = new NamedID();
      ID codItemID = new ID();
      codItemID.setId(rnClient.buscarIdProduto(arrayCamposLote[0]));
      codItemNamedID.setID(codItemID);
      codItemDataValue.setNamedIDValue(codItemNamedID);
      gfs.add(criarGenericField("Produto", codItemDataValue, DataTypeEnum.NAMED_ID));

      // Lote
      if (!arrayCamposLote[1].isEmpty()) {
        gfs.add(criarGenericField("NumeroLote", criarStringDataValue(arrayCamposLote[1]), DataTypeEnum.STRING));
      }

      // Data da emissão
      if (!arrayCamposLote[2].isEmpty()) {
        gfs.add(criarGenericField("DataFabricacao",
            criarDateDataValue(new SimpleDateFormat("dd/MM/yyyy").parse(arrayCamposLote[2])), DataTypeEnum.DATE));
      }

      // Data Validade
      if (!arrayCamposLote[3].isEmpty()) {
        gfs.add(criarGenericField("Validade", criarStringDataValue(arrayCamposLote[3]), DataTypeEnum.STRING));
      }

      // Versão
      if (!arrayCamposLote[4].isEmpty()) {
        gfs.add(criarGenericField("Versao", criarStringDataValue(arrayCamposLote[4]), DataTypeEnum.STRING));
      }

      genericObject.setGenericFields(gfs.toArray(new GenericField[gfs.size()]));
      return genericObject;
    }

    else {
      String mensagem = "Não foi possível carregar Lote porque o campo obrigatório \"Cód. Item\" não foi preenchido. ["
          + i + " de " + tamanhoLista + "] (Lote: " + arrayCamposLote[1] + ")";
      logger.erroArquivo(new Date(), mensagem);
      logger.erroConsole(new Date(), mensagem);
      return null;
    }

  }

  public static GenericObject toProduto(SuperaLogger logger, int i, int tamanhoLista, String[] arrayCamposProduto)
      throws IOException {

    if (!arrayCamposProduto[0].isEmpty()) {
      GenericObject genericObject = new GenericObject();
      List<GenericField> gfs = new ArrayList<GenericField>();
      RNObjectType objType = new RNObjectType();
      objType.setNamespace("CO");
      objType.setTypeName("Produto");
      genericObject.setObjectType(objType);

      // Cód. Produto
      gfs.add(criarGenericField("Codigo", criarStringDataValue(arrayCamposProduto[0]), DataTypeEnum.STRING));

      // Descrição
      if (!arrayCamposProduto[1].isEmpty()) {
        gfs.add(criarGenericField("Descricao", criarStringDataValue(arrayCamposProduto[1]), DataTypeEnum.STRING));
      }

      // Cód. EAN
      if (!arrayCamposProduto[2].isEmpty()) {
        gfs.add(criarGenericField("EAN", criarStringDataValue(arrayCamposProduto[2]), DataTypeEnum.STRING));
      }

      // Gerente Responsável
      if (!arrayCamposProduto[3].isEmpty()) {
        gfs.add(
            criarGenericField("GerenteResponsavel", criarStringDataValue(arrayCamposProduto[3]), DataTypeEnum.STRING));
      }

      // E-mail
      if (!arrayCamposProduto[4].isEmpty()) {
        gfs.add(criarGenericField("Email", criarStringDataValue(arrayCamposProduto[4]), DataTypeEnum.STRING));
      }

      // Situação
      if (!arrayCamposProduto[5].isEmpty()) {
        DataValue situacaoDataValue = new DataValue();
        NamedID situacaoNamedId = new NamedID();
        ID situacaoID = new ID();

        if (arrayCamposProduto[5].equals("Ativo")) {
          situacaoID.setId(1L);
        }

        else if (arrayCamposProduto[5].equals("Inativo")) {
          situacaoID.setId(2L);
        }

        situacaoNamedId.setID(situacaoID);
        situacaoDataValue.setNamedIDValue(situacaoNamedId);
        gfs.add(criarGenericField("Status", situacaoDataValue, DataTypeEnum.NAMED_ID));
      }

      // Tipo Produto
      if (!arrayCamposProduto[6].isEmpty()) {
        DataValue tipoDataValue = new DataValue();
        NamedID tipoNamedId = new NamedID();
        ID tipoID = new ID();

        if (arrayCamposProduto[6].equals("Controlado")) {
          tipoID.setId(1L);
        }

        else if (arrayCamposProduto[6].equals("Correlato")) {
          tipoID.setId(2L);
        }

        else if (arrayCamposProduto[6].equals("Nao Controlado")) {
          tipoID.setId(3L);
        }

        tipoNamedId.setID(tipoID);
        tipoDataValue.setNamedIDValue(tipoNamedId);
        gfs.add(criarGenericField("TipoMaterial", tipoDataValue, DataTypeEnum.NAMED_ID));
      }

      // Nome Comercial(Familia)
      if (!arrayCamposProduto[7].isEmpty()) {
        gfs.add(
            criarGenericField("FamiliaComercial", criarStringDataValue(arrayCamposProduto[7]), DataTypeEnum.STRING));
      }

      genericObject.setGenericFields(gfs.toArray(new GenericField[gfs.size()]));
      return genericObject;
    }

    else {
      String mensagem = "Não foi possível carregar Produto porque o campo obrigatório \"Cód. Produto\" Não foi preenchido. ["
          + i + " de " + tamanhoLista + "] (Descrição do Produto: " + arrayCamposProduto[1] + ")";
      logger.erroArquivo(new Date(), mensagem);
      logger.erroConsole(new Date(), mensagem);
      return null;
    }

  }

  public static GenericObject toNotaFiscal(SuperaLogger logger, int i, int tamanhoLista, String[] arrayCamposNotaFiscal)
      throws ParseException, RequestErrorFault, UnexpectedErrorFault, ServerErrorFault, IOException {
    GenericObject genericObject = new GenericObject();
    List<GenericField> gfs = new ArrayList<GenericField>();
    RNObjectType objType = new RNObjectType();
    RNClient rnClient = new RNClient("integrador", "Supera123@");
    objType.setNamespace("CO");
    objType.setTypeName("NotaFiscal");
    genericObject.setObjectType(objType);

    if (!arrayCamposNotaFiscal[0].isEmpty()) {

      if (!arrayCamposNotaFiscal[4].isEmpty()) {

        if (!arrayCamposNotaFiscal[23].isEmpty()) {

          if (!arrayCamposNotaFiscal[37].isEmpty()) {

            if (rnClient.buscarIdOrganization(arrayCamposNotaFiscal[4]) != -1) {

              // Número
              gfs.add(criarGenericField("NumeroNotaFiscal", criarStringDataValue(arrayCamposNotaFiscal[0]),
                  DataTypeEnum.STRING));

              // Série
              if (!arrayCamposNotaFiscal[1].isEmpty()) {
                gfs.add(criarGenericField("SerieNotaFiscal", criarStringDataValue(arrayCamposNotaFiscal[1]),
                    DataTypeEnum.STRING));
              }

              // Emitente
              if (!arrayCamposNotaFiscal[2].isEmpty()) {
                gfs.add(
                    criarGenericField("Emitente", criarStringDataValue(arrayCamposNotaFiscal[2]), DataTypeEnum.STRING));
              }

              // Destinatário_Nome
              if (!arrayCamposNotaFiscal[3].isEmpty()) {
                gfs.add(criarGenericField("DestinatarioNome", criarStringDataValue(arrayCamposNotaFiscal[3]),
                    DataTypeEnum.STRING));
              }

              // CNPJ/CPF
              if (!arrayCamposNotaFiscal[4].isEmpty()) {
                gfs.add(
                    criarGenericField("CnpjCpf", criarStringDataValue(arrayCamposNotaFiscal[4]), DataTypeEnum.STRING));

                long orgId = rnClient.buscarIdOrganization(arrayCamposNotaFiscal[4]);

                if (orgId != -1) {
                  DataValue orgItemDataValue = new DataValue();
                  NamedID orgItemNamedID = new NamedID();
                  ID orgItemID = new ID();
                  orgItemID.setId(orgId);
                  orgItemNamedID.setID(orgItemID);
                  orgItemDataValue.setNamedIDValue(orgItemNamedID);
                  gfs.add(criarGenericField("Organization", orgItemDataValue, DataTypeEnum.NAMED_ID));
                }

                else {
                  String mensagem = "Não foi possível carregar a Nota Fiscal porque a Organização não foi cadastrada ["
                      + i + " de " + tamanhoLista + "] (Número da Nota Fiscal: " + arrayCamposNotaFiscal[0] + ")";
                  logger.erroArquivo(new Date(), mensagem);
                  logger.erroConsole(new Date(), mensagem);
                  return null;
                }

              }

              // Data da emissão
              if (!arrayCamposNotaFiscal[5].isEmpty()) {
                gfs.add(criarGenericField("DataEmissao",
                    criarDateDataValue(new SimpleDateFormat("dd/MM/yyyy").parse(arrayCamposNotaFiscal[5])),
                    DataTypeEnum.DATE));
              }

              // Endereço
              if (!arrayCamposNotaFiscal[6].isEmpty()) {
                gfs.add(
                    criarGenericField("Endereco", criarStringDataValue(arrayCamposNotaFiscal[6]), DataTypeEnum.STRING));
              }

              // Bairro/Distrito
              if (!arrayCamposNotaFiscal[7].isEmpty()) {
                gfs.add(criarGenericField("BairroDistrito", criarStringDataValue(arrayCamposNotaFiscal[7]),
                    DataTypeEnum.STRING));
              }

              // CEP
              if (!arrayCamposNotaFiscal[8].isEmpty()) {
                gfs.add(criarGenericField("CEP", criarStringDataValue(arrayCamposNotaFiscal[8]), DataTypeEnum.STRING));
              }

              // Município
              if (!arrayCamposNotaFiscal[9].isEmpty()) {
                gfs.add(criarGenericField("Municipio", criarStringDataValue(arrayCamposNotaFiscal[9]),
                    DataTypeEnum.STRING));
              }

              // Fone/Fax
              if (!arrayCamposNotaFiscal[10].isEmpty()) {
                gfs.add(
                    criarGenericField("FoneFax", criarStringDataValue(arrayCamposNotaFiscal[10]), DataTypeEnum.STRING));
              }

              // UF
              if (!arrayCamposNotaFiscal[11].isEmpty()) {
                gfs.add(criarGenericField("UF", criarStringDataValue(arrayCamposNotaFiscal[11]), DataTypeEnum.STRING));
              }

              // Inscrição Estadual
              if (!arrayCamposNotaFiscal[12].isEmpty()) {
                gfs.add(criarGenericField("InscricaoEstadual", criarStringDataValue(arrayCamposNotaFiscal[12]),
                    DataTypeEnum.STRING));
              }

              // Fatura/Duplicata
              if (!arrayCamposNotaFiscal[13].isEmpty()) {
                gfs.add(criarGenericField("FaturaDuplicata", criarStringDataValue(arrayCamposNotaFiscal[13]),
                    DataTypeEnum.STRING));
              }

              // Vencimento
              if (!arrayCamposNotaFiscal[14].isEmpty()) {
                gfs.add(criarGenericField("Vencimento",
                    criarDateDataValue(new SimpleDateFormat("dd/MM/yyyy").parse(arrayCamposNotaFiscal[14])),
                    DataTypeEnum.DATE));
              }

              // Valor
              if (!arrayCamposNotaFiscal[15].isEmpty()) {
                gfs.add(criarGenericField("Valor", criarStringDataValue(arrayCamposNotaFiscal[15]),

                    DataTypeEnum.STRING));
              }

              // Base de cáculo do ICMS
              if (!arrayCamposNotaFiscal[16].isEmpty()) {
                gfs.add(criarGenericField("BaseCalculoICMS", criarStringDataValue(arrayCamposNotaFiscal[16]),
                    DataTypeEnum.STRING));
              }

              // Valor do ICMS
              if (!arrayCamposNotaFiscal[17].isEmpty()) {
                gfs.add(criarGenericField("ValorICMS", criarStringDataValue(arrayCamposNotaFiscal[17]),
                    DataTypeEnum.STRING));
              }

              // Valor total dos produtos
              if (!arrayCamposNotaFiscal[18].isEmpty()) {
                gfs.add(criarGenericField("ValorTotalProdutos", criarStringDataValue(arrayCamposNotaFiscal[18]),
                    DataTypeEnum.STRING));
              }

              // Valor do IPI
              if (!arrayCamposNotaFiscal[19].isEmpty()) {
                gfs.add(criarGenericField("ValorIPI", criarStringDataValue(arrayCamposNotaFiscal[19]),
                    DataTypeEnum.STRING));
              }

              // Valor total da nota
              if (!arrayCamposNotaFiscal[20].isEmpty()) {
                gfs.add(criarGenericField("ValorTotalNota", criarStringDataValue(arrayCamposNotaFiscal[20]),
                    DataTypeEnum.STRING));
              }

              // Nome Transportador
              if (!arrayCamposNotaFiscal[21].isEmpty()) {
                gfs.add(criarGenericField("NomeTransportador", criarStringDataValue(arrayCamposNotaFiscal[21]),
                    DataTypeEnum.STRING));
              }

              // Tipo Nota
              if (!arrayCamposNotaFiscal[22].isEmpty()) {
                gfs.add(criarGenericField("NaturezaDaOperacao", criarStringDataValue(arrayCamposNotaFiscal[22]),
                    DataTypeEnum.STRING));
              }

              // Código Produto/Serviço
              if (!arrayCamposNotaFiscal[23].isEmpty()) {
                DataValue codItemDataValue = new DataValue();
                NamedID codItemNamedID = new NamedID();
                ID codItemID = new ID();
                codItemID.setId(rnClient.buscarIdProduto(arrayCamposNotaFiscal[23]));
                codItemNamedID.setID(codItemID);
                codItemDataValue.setNamedIDValue(codItemNamedID);
                gfs.add(criarGenericField("Produto", codItemDataValue, DataTypeEnum.NAMED_ID));
              }

              // Descrição
              if (!arrayCamposNotaFiscal[24].isEmpty()) {
                gfs.add(criarGenericField("DescricaoProduto", criarStringDataValue(arrayCamposNotaFiscal[24]),
                    DataTypeEnum.STRING));
              }

              // NcmSh
              if (!arrayCamposNotaFiscal[25].isEmpty()) {
                gfs.add(
                    criarGenericField("NcmSh", criarStringDataValue(arrayCamposNotaFiscal[25]), DataTypeEnum.STRING));
              }

              // CST
              if (!arrayCamposNotaFiscal[26].isEmpty()) {
                gfs.add(criarGenericField("CST", criarStringDataValue(arrayCamposNotaFiscal[26]), DataTypeEnum.STRING));
              }

              // CFOP
              if (!arrayCamposNotaFiscal[27].isEmpty()) {
                gfs.add(
                    criarGenericField("CFOP", criarStringDataValue(arrayCamposNotaFiscal[27]), DataTypeEnum.STRING));
              }

              // UN
              if (!arrayCamposNotaFiscal[28].isEmpty()) {
                gfs.add(criarGenericField("UN", criarStringDataValue(arrayCamposNotaFiscal[28]), DataTypeEnum.STRING));
              }

              // Quantidade
              if (!arrayCamposNotaFiscal[29].isEmpty()) {
                gfs.add(criarGenericField("Quantidade", criarStringDataValue(arrayCamposNotaFiscal[29]),
                    DataTypeEnum.STRING));
              }

              // ValorUnitario
              if (!arrayCamposNotaFiscal[30].isEmpty()) {
                gfs.add(criarGenericField("ValorUnitario", criarStringDataValue(arrayCamposNotaFiscal[30]),
                    DataTypeEnum.STRING));
              }

              // ValorTotal
              if (!arrayCamposNotaFiscal[31].isEmpty()) {
                gfs.add(criarGenericField("ValorTotal", criarStringDataValue(arrayCamposNotaFiscal[31]),
                    DataTypeEnum.STRING));
              }

              // BaseCalculoICMSProd
              if (!arrayCamposNotaFiscal[32].isEmpty()) {
                gfs.add(criarGenericField("BaseCalculoICMSProd", criarStringDataValue(arrayCamposNotaFiscal[32]),
                    DataTypeEnum.STRING));
              }

              // ValorICMSProd
              if (!arrayCamposNotaFiscal[33].isEmpty()) {
                gfs.add(criarGenericField("ValorICMSProd", criarStringDataValue(arrayCamposNotaFiscal[33]),
                    DataTypeEnum.STRING));
              }

              // ValorIPIProd
              if (!arrayCamposNotaFiscal[34].isEmpty()) {
                gfs.add(criarGenericField("ValorIPIProd", criarStringDataValue(arrayCamposNotaFiscal[34]),
                    DataTypeEnum.STRING));
              }

              // AliquotasICMS
              if (!arrayCamposNotaFiscal[35].isEmpty()) {
                gfs.add(criarGenericField("AliquotasICMS", criarStringDataValue(arrayCamposNotaFiscal[35]),
                    DataTypeEnum.STRING));
              }

              // AliquotasIPI
              if (!arrayCamposNotaFiscal[36].isEmpty()) {
                gfs.add(criarGenericField("AliquotasIPI", criarStringDataValue(arrayCamposNotaFiscal[36]),
                    DataTypeEnum.STRING));
              }

              // Lote
              if (!arrayCamposNotaFiscal[37].isEmpty()) {
                DataValue loteDataValue = new DataValue();
                NamedID loteItemNamedID = new NamedID();
                ID loteItemID = new ID();
                loteItemID.setId(rnClient.buscarIdLote(arrayCamposNotaFiscal[37]));
                loteItemNamedID.setID(loteItemID);
                loteDataValue.setNamedIDValue(loteItemNamedID);
                gfs.add(criarGenericField("Lote", loteDataValue, DataTypeEnum.NAMED_ID));
              }

              // InfComp
              if (!arrayCamposNotaFiscal[38].isEmpty()) {
                gfs.add(
                    criarGenericField("InfComp", criarStringDataValue(arrayCamposNotaFiscal[38]), DataTypeEnum.STRING));
              }

              // CodCliente
              if (!arrayCamposNotaFiscal[39].isEmpty()) {
                gfs.add(criarGenericField("CodCliente",
                    criarIntegerDataValue(Integer.parseInt(arrayCamposNotaFiscal[39])), DataTypeEnum.INTEGER));
              }

              // NumPedidoVenda
              if (!arrayCamposNotaFiscal[40].isEmpty()) {
                gfs.add(criarGenericField("NumPedidoVenda", criarStringDataValue(arrayCamposNotaFiscal[40]),
                    DataTypeEnum.STRING));
              }

              // CodRepresentante
              if (!arrayCamposNotaFiscal[41].isEmpty()) {
                gfs.add(criarGenericField("CodRepresentante",
                    criarIntegerDataValue(Integer.parseInt(arrayCamposNotaFiscal[41])), DataTypeEnum.INTEGER));
              }

              // NomeRepresentante
              if (!arrayCamposNotaFiscal[42].isEmpty()) {
                gfs.add(criarGenericField("NomeRepresentante", criarStringDataValue(arrayCamposNotaFiscal[42]),
                    DataTypeEnum.STRING));
              }

              genericObject.setGenericFields(gfs.toArray(new GenericField[gfs.size()]));
              return genericObject;
            }

            else {
              String mensagem = "Não foi possível carregar a Nota Fiscal porque a Organização não foi cadastrada. [" + i
                  + " de " + tamanhoLista + "] (Número da Nota Fiscal: " + arrayCamposNotaFiscal[0] + ")";
              logger.erroArquivo(new Date(), mensagem);
              logger.erroConsole(new Date(), mensagem);
              return null;
            }

          }

          else {
            String mensagem = "Não foi possível carregar a Nota Fiscal porque a Organização não foi cadastrada. [" + i
                + " de " + tamanhoLista + "] (Número da Nota Fiscal: " + arrayCamposNotaFiscal[0] + ")";
            logger.erroArquivo(new Date(), mensagem);
            logger.erroConsole(new Date(), mensagem);
            return null;
          }

        }

        else {
          String mensagem = "Não foi possível carregar a Nota Fiscal porque o código do Produto não foi informado. ["
              + i + " de " + tamanhoLista + "] (Número da Nota Fiscal: " + arrayCamposNotaFiscal[0] + ")";
          logger.erroArquivo(new Date(), mensagem);
          logger.erroConsole(new Date(), mensagem);
          return null;
        }

      }

      else {
        String mensagem = "Não foi possível carregar a Nota Fiscal porque porque o CNPJ da Organização não foi informado. ["
            + i + " de " + tamanhoLista + "] (Número da Nota Fiscal: " + arrayCamposNotaFiscal[0] + ")";
        logger.erroArquivo(new Date(), mensagem);
        logger.erroConsole(new Date(), mensagem);
        return null;
      }

    }

    else {
      String mensagem = "Não foi possível carregar a Nota Fiscal porque o campo obrigatório \"Número\" não foi preenchido. ["
          + i + " de " + tamanhoLista + "]";
      logger.erroArquivo(new Date(), mensagem);
      logger.erroConsole(new Date(), mensagem);
      return null;
    }

  }

  private static GenericField criarGenericField(String name, DataValue dataValue, DataTypeEnum type) {
    GenericField genericField = new GenericField();
    genericField.setDataType(type);
    genericField.setName(name);
    genericField.setDataValue(dataValue);
    return genericField;
  }

  private static DataValue criarIntegerDataValue(int val) {
    DataValue dv = new DataValue();
    dv.setIntegerValue(val);
    return dv;
  }

  private static DataValue criarStringDataValue(String val) {
    DataValue dv = new DataValue();
    dv.setStringValue(val);
    return dv;
  }

  private static DataValue criarDateDataValue(Date val) {
    DataValue dv = new DataValue();
    dv.setDateValue(val);
    return dv;
  }

}