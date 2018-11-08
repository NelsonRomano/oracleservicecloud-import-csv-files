package com.csv.rn.supera;

import java.io.File;
import java.io.IOException;
import java.rmi.RemoteException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import org.apache.axis2.AxisFault;
import com.csv.LeitorArquivoCSV;
import com.rn.supera.client.Conversor;
import com.rn.supera.client.RNClient;
import com.rn.supera.client.SuperaLogger;
import com.rn.supera.ws.typed.base.ID;
import com.rn.supera.ws.typed.generic.GenericField;
import com.rn.supera.ws.typed.generic.GenericObject;
import com.rn.supera.ws.typed.objects.Contact;
import com.rn.supera.ws.typed.objects.Organization;
import com.rn.supera.ws.typed.wsdl.RequestErrorFault;
import com.rn.supera.ws.typed.wsdl.RequestErrorFaultDetail;
import com.rn.supera.ws.typed.wsdl.ServerErrorFault;
import com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault;

public class Carregador {

  public static void carregarOrganizacao(String nomeDiretorio) throws IOException {
    File[] arquivos = LeitorArquivoCSV.filtrarArquivos(nomeDiretorio, "cliente_[^_]*.csv");

    if (arquivos.length != 0) {

      for (File arquivo : arquivos) {
        SuperaLogger logger = new SuperaLogger(nomeDiretorio, arquivo.getName());
        Organization organizacao = new Organization();
        List<String> linhasCSV = LeitorArquivoCSV.lerArquivo(nomeDiretorio, arquivo.getName());
        String mensagem = "Iniciando carga de Clientes";
        logger.infoConsole(new Date(), mensagem);
        logger.infoArquivo(new Date(), mensagem);
        int i = 0;

        for (String linhaCSV : linhasCSV) {
          i++;
          organizacao = Conversor.toOrganization(logger, i, linhasCSV.size(), LeitorArquivoCSV.linhaToArray(linhaCSV));
          String cnpj = "";

          for (GenericField genericField : organizacao.getCustomFields().getGenericFields()) {

            for (GenericField genericField2 : genericField.getDataValue().getObjectValue().getGenericFields()) {

              if (genericField2.getName().equals("cnpj")) {
                cnpj = genericField2.getDataValue().getStringValue();
                RNClient rnClient = new RNClient("usuario", "senha");

                try {

                  if (rnClient.buscarIdCliente(cnpj) != -1) {
                    ID id = new ID();
                    id.setId(rnClient.buscarIdCliente(cnpj));
                    organizacao.setID(id);
                    rnClient.atualizarOrganization(organizacao);
                    mensagem = "Cliente atualizado com sucesso. [" + i + " de " + linhasCSV.size() + "] (CGC: " + cnpj
                        + "/ID: " + organizacao.getID().getId() + ")";
                    logger.infoConsole(new Date(), mensagem);
                    logger.infoArquivo(new Date(), mensagem);
                  }

                  else {
                    Organization organization = rnClient.criarOrganization(organizacao);
                    mensagem = "Cliente criada com sucesso. [" + i + " de " + linhasCSV.size() + "] (CGC: " + cnpj
                        + "/ID: " + organization.getID().getId() + ")";
                    logger.infoConsole(new Date(), mensagem);
                    logger.infoArquivo(new Date(), mensagem);
                  }

                  break;
                }

                catch (RequestErrorFaultDetail e) {
                  mensagem = "Não foi possível carregar Cliente. [" + i + " de " + linhasCSV.size() + "] (CGC: " + cnpj
                      + ") Motivo:";
                  logger.erroConsole(new Date(), mensagem, e);
                  logger.erroArquivo(new Date(), mensagem, e);
                }

                catch (RemoteException e) {
                  mensagem = "Não foi possível carregar Cliente. [" + i + " de " + linhasCSV.size() + "] (CGC: " + cnpj
                      + ") Motivo:";
                  logger.erroConsole(new Date(), mensagem, e);
                  logger.erroArquivo(new Date(), mensagem, e);
                }

                catch (RequestErrorFault e) {
                  mensagem = "Não foi possível carregar Cliente. [" + i + " de " + linhasCSV.size() + "] (CGC: " + cnpj
                      + ") Motivo:";
                  logger.erroConsole(new Date(), mensagem, e);
                  logger.erroArquivo(new Date(), mensagem, e);
                }

                catch (UnexpectedErrorFault e) {
                  mensagem = "Não foi possível carregar Cliente. [" + i + " de " + linhasCSV.size() + "] (CGC: " + cnpj
                      + ") Motivo:";
                  logger.erroConsole(new Date(), mensagem, e);
                  logger.erroArquivo(new Date(), mensagem, e);
                }

                catch (ServerErrorFault e) {
                  mensagem = "Não foi possível carregar Cliente. [" + i + " de " + linhasCSV.size() + "] (CGC: " + cnpj
                      + ") Motivo:";
                  logger.erroConsole(new Date(), mensagem, e);
                  logger.erroArquivo(new Date(), mensagem, e);
                }

                catch (ParseException e) {
                  mensagem = "Não foi possível carregar Cliente. [" + i + " de " + linhasCSV.size() + "] (CGC: " + cnpj
                      + ") Motivo:";
                  logger.erroConsole(new Date(), mensagem, e);
                  logger.erroArquivo(new Date(), mensagem, e);
                }

              }

            }

          }

        }

        try {
          LeitorArquivoCSV.moverArquivoCSV(nomeDiretorio, arquivos[0].getName());
          arquivos = LeitorArquivoCSV.filtrarArquivos(nomeDiretorio, "cliente_[^_]*.csv");
          mensagem = "Fim do processo de carga de Clientes.";
          logger.infoConsole(new Date(), mensagem);
          logger.infoArquivo(new Date(), mensagem);
        }

        catch (IOException e) {
          e.printStackTrace();
        }

      }

    }

  }

  public static void carregarContato(String nomeDiretorio) throws IOException {
    File[] arquivos = LeitorArquivoCSV.filtrarArquivos(nomeDiretorio, "funcionario_[^_]*.csv");

    if (arquivos.length != 0) {

      for (File arquivo : arquivos) {
        SuperaLogger logger = new SuperaLogger(nomeDiretorio, arquivo.getName());
        Contact contato = new Contact();
        String mensagem = "Iniciando carga de Funcionários";
        logger.infoConsole(new Date(), mensagem);
        logger.infoArquivo(new Date(), mensagem);
        List<String> linhasCSV = LeitorArquivoCSV.lerArquivo(nomeDiretorio, arquivo.getName());
        int i = 0;

        try {

          for (String linhaCSV : linhasCSV) {
            i++;
            contato = Conversor.toContact(logger, i, linhasCSV.size(), LeitorArquivoCSV.linhaToArray(linhaCSV));
            String cpf = "";

            for (GenericField genericField : contato.getCustomFields().getGenericFields()) {

              for (GenericField genericField2 : genericField.getDataValue().getObjectValue().getGenericFields()) {

                if (genericField2.getName().equals("cpf")) {
                  cpf = genericField2.getDataValue().getStringValue();

                  try {
                    RNClient rnClient = new RNClient("usuario", "senha");

                    if (rnClient.buscarIdFuncionario(cpf) != -1) {
                      ID id = new ID();
                      id.setId(rnClient.buscarIdFuncionario(cpf));
                      contato.setID(id);
                      rnClient.atualizarContact(contato);
                      mensagem = "Funcionário atualizado com sucesso. [" + i + " de " + linhasCSV.size() + "] (CPF: "
                          + cpf + "/ID: " + contato.getID().getId() + ")";
                      logger.infoConsole(new Date(), mensagem);
                      logger.infoArquivo(new Date(), mensagem);
                    }

                    else {
                      Contact contact = rnClient.criarContact(contato);
                      mensagem = "Funcionário criado com sucesso. [" + i + " de " + linhasCSV.size() + "] (CPF: " + cpf
                          + "/ID: " + contact + ")";
                      logger.infoConsole(new Date(), mensagem);
                      logger.infoArquivo(new Date(), mensagem);
                    }

                  }

                  catch (AxisFault e) {
                    mensagem = "Não foi possível carregar Funcionário. [" + i + " de " + linhasCSV.size() + "] (CPF: "
                        + cpf + ") Motivo:";
                    logger.erroConsole(new Date(), mensagem, e);
                    logger.erroArquivo(new Date(), mensagem, e);
                  }

                  catch (ParseException e) {
                    mensagem = "Não foi possível carregar Funcionário. [" + i + " de " + linhasCSV.size() + "] (CPF: "
                        + cpf + ") Motivo:";
                    logger.erroConsole(new Date(), mensagem, e);
                    logger.erroArquivo(new Date(), mensagem, e);
                  }

                  catch (ServerErrorFault e) {
                    mensagem = "Não foi possível carregar Funcionário. [" + i + " de " + linhasCSV.size() + "] (CPF: "
                        + cpf + ") Motivo:";
                    logger.erroConsole(new Date(), mensagem, e);
                    logger.erroArquivo(new Date(), mensagem, e);
                  }

                  catch (UnexpectedErrorFault e) {
                    mensagem = "Não foi possível carregar Funcionário. [" + i + " de " + linhasCSV.size() + "] (CPF: "
                        + cpf + ") Motivo:";
                    logger.erroConsole(new Date(), mensagem, e);
                    logger.erroArquivo(new Date(), mensagem, e);
                  }

                  catch (RequestErrorFault e) {
                    mensagem = "Não foi possível carregar Funcionário. [" + i + " de " + linhasCSV.size() + "] (CPF: "
                        + cpf + ") Motivo:";
                    logger.erroConsole(new Date(), mensagem, e);
                    logger.erroArquivo(new Date(), mensagem, e);
                  }

                  catch (RemoteException e) {
                    mensagem = "Não foi possível carregar Funcionário. [" + i + " de " + linhasCSV.size() + "] (CPF: "
                        + cpf + ") Motivo:";
                    logger.erroConsole(new Date(), mensagem, e);
                    logger.erroArquivo(new Date(), mensagem, e);
                  }

                  catch (RequestErrorFaultDetail e) {
                    mensagem = "Não foi possível carregar Funcionário. [" + i + " de " + linhasCSV.size() + "] (CPF: "
                        + cpf + ") Motivo:";
                    logger.erroConsole(new Date(), mensagem, e);
                    logger.erroArquivo(new Date(), mensagem, e);
                  }

                }

              }

            }

          }

          try {
            LeitorArquivoCSV.moverArquivoCSV(nomeDiretorio, arquivos[0].getName());
            arquivos = LeitorArquivoCSV.filtrarArquivos(nomeDiretorio, "funcionario_[^_]*.csv");
            mensagem = "Fim do processo de carga de Funcionários.";
            logger.infoConsole(new Date(), mensagem);
            logger.infoArquivo(new Date(), mensagem);
          }

          catch (IOException e) {
            e.printStackTrace();
          }

        }

        catch (ParseException e) {
          e.printStackTrace();
        }

      }

    }

  }

  public static void carregarLote(String nomeDiretorio) throws IOException {
    File[] arquivos = LeitorArquivoCSV.filtrarArquivos(nomeDiretorio, "lote_[^_]*.csv");

    if (arquivos.length != 0) {

      for (File arquivo : arquivos) {
        SuperaLogger logger = new SuperaLogger(nomeDiretorio, arquivo.getName());
        GenericObject lote = new GenericObject();
        String mensagem = "Iniciando carga de Lotes";
        logger.infoConsole(new Date(), mensagem);
        logger.infoArquivo(new Date(), mensagem);
        List<String> linhasCSV = LeitorArquivoCSV.lerArquivo(nomeDiretorio, arquivo.getName());
        int i = 0;

        try {

          for (String linhaCSV : linhasCSV) {
            i++;
            lote = Conversor.toLote(logger, i, linhasCSV.size(), LeitorArquivoCSV.linhaToArray(linhaCSV));
            String numeroLote = "";

            for (GenericField genericField : lote.getGenericFields()) {

              if (genericField.getName().equals("NumeroLote")) {
                numeroLote = genericField.getDataValue().getStringValue();

                try {
                  RNClient rnClient = new RNClient("usuario", "senha");

                  if (rnClient.buscarIdLote(numeroLote) != -1) {
                    ID id = new ID();
                    id.setId(rnClient.buscarIdLote(numeroLote));
                    lote.setID(id);
                    rnClient.atualizarGenericObject(lote);
                    mensagem = "Lote atualizado com sucesso. [" + i + " de " + linhasCSV.size() + "] (Número do Lote: "
                        + numeroLote + "/ID: " + lote.getID().getId() + ")";
                    logger.infoConsole(new Date(), mensagem);
                    logger.infoArquivo(new Date(), mensagem);
                  }

                  else {
                    GenericObject genericObject = rnClient.criarGenericObject(lote);
                    mensagem = "Lote criado com sucesso. [" + i + "" + linhasCSV.size() + "] (Número do Lote: "
                        + numeroLote + "/ID: " + genericObject.getID().getId() + ")";
                    logger.infoConsole(new Date(), mensagem);
                    logger.infoArquivo(new Date(), mensagem);
                  }

                }

                catch (AxisFault e) {
                  mensagem = "Não foi possível criar Lote. [" + i + " de " + linhasCSV.size() + "] (Número do Lote: "
                      + numeroLote + ") Motivo:";
                  logger.erroConsole(new Date(), mensagem, e);
                  logger.erroArquivo(new Date(), mensagem, e);
                }

                catch (ParseException e) {
                  mensagem = "Não foi possível criar Lote. [" + i + " de " + linhasCSV.size() + "] (Número do Lote: "
                      + numeroLote + ") Motivo:";
                  logger.erroConsole(new Date(), mensagem, e);
                  logger.erroArquivo(new Date(), mensagem, e);
                }

                catch (ServerErrorFault e) {
                  mensagem = "Não foi possível criar Lote. [" + i + " de " + linhasCSV.size() + "] (Número do Lote: "
                      + numeroLote + ") Motivo:";
                  logger.erroConsole(new Date(), mensagem, e);
                  logger.erroArquivo(new Date(), mensagem, e);
                }

                catch (UnexpectedErrorFault e) {
                  mensagem = "Não foi possível criar Lote. [" + i + " de " + linhasCSV.size() + "] (Número do Lote: "
                      + numeroLote + ") Motivo:";
                  logger.erroConsole(new Date(), mensagem, e);
                  logger.erroArquivo(new Date(), mensagem, e);
                }

                catch (RequestErrorFault e) {
                  mensagem = "Não foi possível criar Lote. [" + i + " de " + linhasCSV.size() + "] (Número do Lote: "
                      + numeroLote + ") Motivo:";
                  logger.erroConsole(new Date(), mensagem, e);
                  logger.erroArquivo(new Date(), mensagem, e);
                }

                catch (RemoteException e) {
                  mensagem = "Não foi possível criar Lote. [" + i + " de " + linhasCSV.size() + "] (Número do Lote: "
                      + numeroLote + ") Motivo:";
                  logger.erroConsole(new Date(), mensagem, e);
                  logger.erroArquivo(new Date(), mensagem, e);
                }

                catch (RequestErrorFaultDetail e) {
                  mensagem = "Não foi possível criar Lote. [" + i + " de " + linhasCSV.size() + "] (Número do Lote: "
                      + numeroLote + ") Motivo:";
                  logger.erroConsole(new Date(), mensagem, e);
                  logger.erroArquivo(new Date(), mensagem, e);
                }

              }

            }

          }

          try {
            LeitorArquivoCSV.moverArquivoCSV(nomeDiretorio, arquivos[0].getName());
            arquivos = LeitorArquivoCSV.filtrarArquivos(nomeDiretorio, "lote_[^_]*.csv");
            mensagem = "Fim do processo de carga de Lotes.";
            logger.infoConsole(new Date(), mensagem);
            logger.infoArquivo(new Date(), mensagem);
          }

          catch (IOException e) {
            e.printStackTrace();
          }

        }

        catch (ServerErrorFault e) {
          e.printStackTrace();
        }

        catch (UnexpectedErrorFault e) {
          e.printStackTrace();
        }

        catch (RequestErrorFault e) {
          e.printStackTrace();
        }

        catch (ParseException e) {
          e.printStackTrace();
        }

      }

    }

  }

  public static void carregarProduto(String nomeDiretorio) throws IOException {
    File[] arquivos = LeitorArquivoCSV.filtrarArquivos(nomeDiretorio, "produto_[^_]*.csv");

    if (arquivos.length != 0) {

      for (File arquivo : arquivos) {
        SuperaLogger logger = new SuperaLogger(nomeDiretorio, arquivo.getName());
        GenericObject produto = new GenericObject();
        String mensagem = "Iniciando carga de Produtos";
        logger.infoConsole(new Date(), mensagem);
        logger.infoArquivo(new Date(), mensagem);
        List<String> linhasCSV = LeitorArquivoCSV.lerArquivo(nomeDiretorio, arquivo.getName());
        int i = 0;

        for (String linhaCSV : linhasCSV) {
          i++;
          produto = Conversor.toProduto(logger, i, linhasCSV.size(), LeitorArquivoCSV.linhaToArray(linhaCSV));

          String codProduto = "";

          for (GenericField genericField : produto.getGenericFields()) {

            if (genericField.getName().equals("Codigo")) {
              codProduto = genericField.getDataValue().getStringValue();

              try {
                RNClient rnClient = new RNClient("usuario", "senha");

                if (rnClient.buscarIdProduto(codProduto) != -1) {
                  ID id = new ID();
                  long idLong = rnClient.buscarIdProduto(codProduto);
                  id.setId(idLong);
                  produto.setID(id);
                  rnClient.atualizarGenericObject(produto);
                  mensagem = "Produto atualizado com sucesso. [" + i + " de " + linhasCSV.size()
                      + "] (Código do Produto: " + codProduto + "/ID: " + idLong + ")";
                  logger.infoConsole(new Date(), mensagem);
                  logger.infoArquivo(new Date(), mensagem);
                }

                else {
                  GenericObject genericObject = rnClient.criarGenericObject(produto);
                  mensagem = "Produto criado com sucesso. [" + i + " de " + linhasCSV.size() + "] (Código do Produto: "
                      + codProduto + "/ID: " + genericObject.getID().getId() + ")";
                  logger.infoConsole(new Date(), mensagem);
                  logger.infoArquivo(new Date(), mensagem);
                }

              }

              catch (AxisFault e) {
                mensagem = "Não foi possível criar Produto. [" + i + " de " + linhasCSV.size()
                    + "] (Código do Produto: " + codProduto + ") Motivo:";
                logger.erroConsole(new Date(), mensagem, e);
                logger.erroArquivo(new Date(), mensagem, e);
              }

              catch (ParseException e) {
                mensagem = "Não foi possível criar Produto. [" + i + " de " + linhasCSV.size()
                    + "] (Código do Produto: " + codProduto + ") Motivo:";
                logger.erroConsole(new Date(), mensagem, e);
                logger.erroArquivo(new Date(), mensagem, e);
              }

              catch (ServerErrorFault e) {
                mensagem = "Não foi possível criar Produto. [" + i + " de " + linhasCSV.size()
                    + "] (Código do Produto: " + codProduto + ") Motivo:";
                logger.erroConsole(new Date(), mensagem, e);
                logger.erroArquivo(new Date(), mensagem, e);
              }

              catch (UnexpectedErrorFault e) {
                mensagem = "Não foi possível criar Produto. [" + i + " de " + linhasCSV.size()
                    + "] (Código do Produto: " + codProduto + ") Motivo:";
                logger.erroConsole(new Date(), mensagem, e);
                logger.erroArquivo(new Date(), mensagem, e);
              }

              catch (RequestErrorFault e) {
                mensagem = "Não foi possível criar Produto. [" + i + " de " + linhasCSV.size()
                    + "] (Código do Produto: " + codProduto + ") Motivo:";
                logger.erroConsole(new Date(), mensagem, e);
                logger.erroArquivo(new Date(), mensagem, e);
              }

              catch (RemoteException e) {
                mensagem = "Não foi possível criar Produto. [" + i + " de " + linhasCSV.size()
                    + "] (Código do Produto: " + codProduto + ") Motivo:";
                logger.erroConsole(new Date(), mensagem, e);
                logger.erroArquivo(new Date(), mensagem, e);
              }

              catch (RequestErrorFaultDetail e) {
                mensagem = "Não foi possível criar Produto. [" + i + " de " + linhasCSV.size()
                    + "] (Código do Produto: " + codProduto + ") Motivo:";
                logger.erroConsole(new Date(), mensagem, e);
                logger.erroArquivo(new Date(), mensagem, e);
              }

            }

          }

        }

        try {
          LeitorArquivoCSV.moverArquivoCSV(nomeDiretorio, arquivos[0].getName());
          arquivos = LeitorArquivoCSV.filtrarArquivos(nomeDiretorio, "produto_[^_]*.csv");
          mensagem = "Fim do processo de carga de Produtos.";
          logger.infoConsole(new Date(), mensagem);
          logger.infoArquivo(new Date(), mensagem);
        }

        catch (IOException e) {
          e.printStackTrace();
        }

      }

    }

  }

  public static void carregarNota(String nomeDiretorio) throws IOException {
    File[] arquivos = LeitorArquivoCSV.filtrarArquivos(nomeDiretorio, "nota_[^_]*.csv");

    if (arquivos.length != 0) {

      for (File arquivo : arquivos) {
        SuperaLogger logger = new SuperaLogger(nomeDiretorio, arquivo.getName());
        GenericObject nota = new GenericObject();
        String mensagem = "Iniciando carga de Notas Fiscais";
        logger.infoConsole(new Date(), mensagem);
        logger.infoArquivo(new Date(), mensagem);
        List<String> linhasCSV = LeitorArquivoCSV.lerArquivo(nomeDiretorio, arquivo.getName());
        String numNota = "";
        int i = 0;

        try {

          for (String linhaCSV : linhasCSV) {
            i++;
            nota = Conversor.toNotaFiscal(logger, i, linhasCSV.size(), LeitorArquivoCSV.linhaToArray(linhaCSV));

            if (nota != null && nota.getGenericFields() != null) {

              for (GenericField genericField : nota.getGenericFields()) {

                if (genericField.getName().equals("NumeroNotaFiscal")) {
                  numNota = genericField.getDataValue().getStringValue();
                  RNClient rnClient = new RNClient("usuario", "senha");
                  GenericObject genericObject = rnClient.criarGenericObject(nota);
                  mensagem = "Nota Fiscal criada com sucesso. [" + i + " de " + linhasCSV.size()
                      + "] (Número da Nota Fiscal: " + numNota + "/ID: " + genericObject.getID().getId() + ")";
                  logger.infoConsole(new Date(), mensagem);
                  logger.infoArquivo(new Date(), mensagem);
                }

              }

            }

          }

          try {
            LeitorArquivoCSV.moverArquivoCSV(nomeDiretorio, arquivos[0].getName());
            arquivos = LeitorArquivoCSV.filtrarArquivos(nomeDiretorio, "nota_[^_]*.csv");
            mensagem = "Fim do processo de carga de Notas Fiscais.";
            logger.infoConsole(new Date(), mensagem);
            logger.infoArquivo(new Date(), mensagem);
          }

          catch (IOException e) {
            e.printStackTrace();
          }

        }

        catch (AxisFault e) {
          mensagem = "Não foi possível carregar Nota Fiscal. [" + i + " de " + linhasCSV.size()
              + "] (Número da Nota Fiscal: " + numNota + ") Motivo:";
          logger.erroConsole(new Date(), mensagem, e);
          logger.erroArquivo(new Date(), mensagem, e);
        }

        catch (RemoteException e) {
          mensagem = "Não foi possível carregar Nota Fiscal. [" + i + " de " + linhasCSV.size()
              + "] (Número da Nota Fiscal: " + numNota + ") Motivo:";
          logger.erroConsole(new Date(), mensagem, e);
          logger.erroArquivo(new Date(), mensagem, e);
        }

        catch (RequestErrorFault e) {
          mensagem = "Não foi possível carregar Nota Fiscal. [" + i + " de " + linhasCSV.size()
              + "] (Número da Nota Fiscal: " + numNota + ") Motivo:";
          logger.erroConsole(new Date(), mensagem, e);
          logger.erroArquivo(new Date(), mensagem, e);
        }

        catch (UnexpectedErrorFault e) {
          mensagem = "Não foi possível carregar Nota Fiscal. [" + i + " de " + linhasCSV.size()
              + "] (Número da Nota Fiscal: " + numNota + ") Motivo:";
          logger.erroConsole(new Date(), mensagem, e);
          logger.erroArquivo(new Date(), mensagem, e);
        }

        catch (ServerErrorFault e) {
          mensagem = "Não foi possível carregar Nota Fiscal. [" + i + " de " + linhasCSV.size()
              + "] (Número da Nota Fiscal: " + numNota + ") Motivo:";
          logger.erroConsole(new Date(), mensagem, e);
          logger.erroArquivo(new Date(), mensagem, e);
        }

        catch (RequestErrorFaultDetail e) {
          mensagem = "Não foi possível carregar Nota Fiscal. [" + i + " de " + linhasCSV.size()
              + "] (Número da Nota Fiscal: " + numNota + ") Motivo:";
          logger.erroConsole(new Date(), mensagem, e);
          logger.erroArquivo(new Date(), mensagem, e);
        }

        catch (ParseException e) {
          mensagem = "Não foi possível carregar Nota Fiscal. [" + i + " de " + linhasCSV.size()
              + "] (Número da Nota Fiscal: " + numNota + ") Motivo:";
          logger.erroConsole(new Date(), mensagem, e);
          logger.erroArquivo(new Date(), mensagem, e);
        }

      }

    }

  }

}