package com.rn.supera.client;

import java.rmi.RemoteException;
import org.apache.axis2.AxisFault;
import org.apache.axis2.client.ServiceClient;
import com.rn.supera.ws.typed.base.ActionEnum;
import com.rn.supera.ws.typed.base.RNObject;
import com.rn.supera.ws.typed.generic.GenericObject;
import com.rn.supera.ws.typed.messages.CSVTable;
import com.rn.supera.ws.typed.messages.ClientInfoHeader;
import com.rn.supera.ws.typed.messages.CreateProcessingOptions;
import com.rn.supera.ws.typed.messages.QueryCSVResponseMsg;
import com.rn.supera.ws.typed.messages.RNObjectsResult;
import com.rn.supera.ws.typed.messages.UpdateResponseMsg;
import com.rn.supera.ws.typed.objects.Contact;
import com.rn.supera.ws.typed.objects.Email;
import com.rn.supera.ws.typed.objects.Organization;
import com.rn.supera.ws.typed.objects.Phone;
import com.rn.supera.ws.typed.objects.TypedAddress;
import com.rn.supera.ws.typed.wsdl.RequestErrorFault;
import com.rn.supera.ws.typed.wsdl.RequestErrorFaultDetail;
import com.rn.supera.ws.typed.wsdl.RightNowSyncServiceStub;
import com.rn.supera.ws.typed.wsdl.ServerErrorFault;
import com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault;
import java.text.ParseException;
import com.rn.supera.ws.typed.messages.UpdateProcessingOptions;

public class RNClient {
    private static RightNowSyncServiceStub _service;

    public RNClient(String usuario, String senha) throws AxisFault {
        _service = new RightNowSyncServiceStub();
        ServiceClient serviceClient = ((org.apache.axis2.client.Stub) _service)._getServiceClient();
        _service._setServiceClient(serviceClient);
        Autenticacao autenticacao = new Autenticacao();
        serviceClient.addHeader(autenticacao.criarSecurityHeader(usuario, senha));
    }

    public UpdateResponseMsg atualizarContact(Contact contact)
            throws RemoteException, RequestErrorFault, UnexpectedErrorFault, ServerErrorFault, RequestErrorFaultDetail {
        ClientInfoHeader clientInfoHeader = new ClientInfoHeader();
        clientInfoHeader.setAppID("Basic Update");
        UpdateProcessingOptions updateProcessingOptions = new UpdateProcessingOptions();
        updateProcessingOptions.setSuppressExternalEvents(false);
        updateProcessingOptions.setSuppressRules(false);

        if (contact.getEmails() != null) {

            for (Email email : contact.getEmails().getEmailList()) {
                email.setAction(ActionEnum.update);
            }

        }

        if (contact.getPhones() != null) {

            for (Phone phone : contact.getPhones().getPhoneList()) {
                phone.setAction(ActionEnum.update);
            }

        }

        RNObject[] rnObjects = new RNObject[] { contact };
        return _service.update(rnObjects, updateProcessingOptions, clientInfoHeader);
    }

    public UpdateResponseMsg atualizarOrganization(Organization organization)
            throws RemoteException, RequestErrorFault, UnexpectedErrorFault, ServerErrorFault, RequestErrorFaultDetail {
        ClientInfoHeader clientInfoHeader = new ClientInfoHeader();
        clientInfoHeader.setAppID("Basic Update");
        UpdateProcessingOptions updateProcessingOptions = new UpdateProcessingOptions();
        updateProcessingOptions.setSuppressExternalEvents(false);
        updateProcessingOptions.setSuppressRules(false);

        if (organization.getAddresses() != null) {

            for (TypedAddress typedAddress : organization.getAddresses().getTypedAddressList()) {
                typedAddress.setAction(ActionEnum.update);
            }

        }

        RNObject[] rnObjects = new RNObject[] { organization };
        return _service.update(rnObjects, updateProcessingOptions, clientInfoHeader);
    }

    public UpdateResponseMsg atualizarGenericObject(GenericObject genericObject)
            throws RemoteException, RequestErrorFault, UnexpectedErrorFault, ServerErrorFault, RequestErrorFaultDetail {
        ClientInfoHeader clientInfoHeader = new ClientInfoHeader();
        clientInfoHeader.setAppID("Basic Update");
        UpdateProcessingOptions updateProcessingOptions = new UpdateProcessingOptions();
        updateProcessingOptions.setSuppressExternalEvents(false);
        updateProcessingOptions.setSuppressRules(false);
        RNObject[] rnObjects = new RNObject[] { genericObject };
        return _service.update(rnObjects, updateProcessingOptions, clientInfoHeader);
    }

    public long buscarIdCliente(String cnpj)
            throws RemoteException, RequestErrorFault, UnexpectedErrorFault, ServerErrorFault, ParseException {
        String query = "SELECT O.ID FROM Organization O WHERE CustomFields.c.cnpj LIKE '" + cnpj + "';";
        QueryCSVResponseMsg queryCSVResponseMsg = realizarQueryCSV(query);
        CSVTable csvTable = queryCSVResponseMsg.getCSVTableSet().getCSVTables().getCSVTable()[0];

        if (csvTable.getRows().getRow() != null) {
            return Long.parseLong(csvTable.getRows().getRow()[0]);
        }

        else {
            return -1L;
        }

    }

    public long buscarIdFuncionario(String cpf)
            throws RemoteException, RequestErrorFault, UnexpectedErrorFault, ServerErrorFault, ParseException {
        String query = "SELECT C.ID FROM Contact C WHERE CustomFields.c.cpf LIKE '" + cpf + "';";
        QueryCSVResponseMsg queryCSVResponseMsg = realizarQueryCSV(query);
        CSVTable csvTable = queryCSVResponseMsg.getCSVTableSet().getCSVTables().getCSVTable()[0];

        if (csvTable.getRows().getRow() != null) {
            return Long.parseLong(csvTable.getRows().getRow()[0]);
        }

        else {
            return -1L;
        }

    }

    public long buscarIdLote(String numeroLote)
            throws RemoteException, RequestErrorFault, UnexpectedErrorFault, ServerErrorFault, ParseException {
        String query = "SELECT C.ID FROM CO.Lote C WHERE NumeroLote LIKE '" + numeroLote + "';";
        QueryCSVResponseMsg queryCSVResponseMsg = realizarQueryCSV(query);
        CSVTable csvTable = queryCSVResponseMsg.getCSVTableSet().getCSVTables().getCSVTable()[0];

        if (csvTable.getRows().getRow() != null) {
            return Long.parseLong(csvTable.getRows().getRow()[0]);
        }

        else {
            return -1L;
        }
    }

    public long buscarIdOrganization(String cnpj) throws RemoteException, RequestErrorFault, UnexpectedErrorFault, ServerErrorFault, ParseException {
        String query = "SELECT O.id FROM Organization O WHERE CustomFields.c.cnpj LIKE '" + cnpj + "';";
        QueryCSVResponseMsg queryCSVResponseMsg = realizarQueryCSV(query);
        CSVTable csvTable = queryCSVResponseMsg.getCSVTableSet().getCSVTables().getCSVTable()[0];

        if (csvTable.getRows().getRow() != null) {
            return Long.parseLong(csvTable.getRows().getRow()[0]);
        }

        else {
            return -1L;
        }
    }
    
    public long buscarIdProduto(String codProduto)
            throws RemoteException, RequestErrorFault, UnexpectedErrorFault, ServerErrorFault, ParseException {
        String query = "SELECT P.ID FROM CO.Produto P WHERE Codigo LIKE '" + codProduto + "';";
        QueryCSVResponseMsg queryCSVResponseMsg = realizarQueryCSV(query);
        CSVTable csvTable = queryCSVResponseMsg.getCSVTableSet().getCSVTables().getCSVTable()[0];

        if (csvTable.getRows().getRow() != null) {
            return Long.parseLong(csvTable.getRows().getRow()[0]);
        }

        else {
            return -1L;
        }

    }

    public Organization criarOrganization(Organization organization)
            throws RemoteException, ServerErrorFault, RequestErrorFault, UnexpectedErrorFault, RequestErrorFaultDetail {
        RNObject[] createObjects = { organization };
        CreateProcessingOptions createProcessingOptions = new CreateProcessingOptions();
        createProcessingOptions.setSuppressExternalEvents(false);
        createProcessingOptions.setSuppressRules(false);
        ClientInfoHeader clientInfoHeader = new ClientInfoHeader();
        clientInfoHeader.setAppID("Generic Create");
        RNObjectsResult createRes = _service.create(createObjects, createProcessingOptions, clientInfoHeader);
        return (Organization) createRes.getRNObjects()[0];
    }

    public Contact criarContact(Contact contact) throws org.apache.axis2.AxisFault, RemoteException, RequestErrorFault,
            UnexpectedErrorFault, ServerErrorFault, RequestErrorFaultDetail {
        RNObject[] createObjects = { contact };
        CreateProcessingOptions createProcessingOptions = new CreateProcessingOptions();
        createProcessingOptions.setSuppressExternalEvents(false);
        createProcessingOptions.setSuppressRules(false);
        ClientInfoHeader clientInfoHeader = new ClientInfoHeader();
        clientInfoHeader.setAppID("Generic Create");
        RNObjectsResult createRes = _service.create(createObjects, createProcessingOptions, clientInfoHeader);
        return (Contact) createRes.getRNObjects()[0];
    }

    public GenericObject criarGenericObject(GenericObject genericObject)
            throws RemoteException, RequestErrorFault, UnexpectedErrorFault, ServerErrorFault, RequestErrorFaultDetail {
        RNObject[] createObjects = { genericObject };
        CreateProcessingOptions createProcessingOptions = new CreateProcessingOptions();
        createProcessingOptions.setSuppressExternalEvents(false);
        createProcessingOptions.setSuppressRules(false);
        ClientInfoHeader clientInfoHeader = new ClientInfoHeader();
        clientInfoHeader.setAppID("Generic Create");
        RNObjectsResult createRes = _service.create(createObjects, createProcessingOptions, clientInfoHeader);
        return (GenericObject) createRes.getRNObjects()[0];
    }

    public static QueryCSVResponseMsg realizarQueryCSV(String query)
            throws RemoteException, RequestErrorFault, UnexpectedErrorFault, ServerErrorFault, ParseException {
        ClientInfoHeader clientInfoHeader = new ClientInfoHeader();
        clientInfoHeader.setAppID("Basic Query CSV");
        QueryCSVResponseMsg queryCSVResponseMsg = _service.queryCSV(query, -1, ",", false, false, clientInfoHeader);
        return queryCSVResponseMsg;
    }

}