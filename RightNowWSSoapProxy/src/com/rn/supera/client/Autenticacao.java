package com.rn.supera.client;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.OMNamespace;
import org.apache.axiom.soap.impl.dom.soap11.SOAP11Factory;
import org.apache.ws.security.WSConstants;

class Autenticacao {

    // Método que cria cabeçalho de segurança para autenticação
    OMElement criarSecurityHeader(String username, String password) {
        OMFactory factory = new SOAP11Factory();
        OMNamespace wsseNS = factory.createOMNamespace(WSConstants.WSSE_NS, WSConstants.WSSE_PREFIX);
        OMElement usernameTokenElement = factory.createOMElement(WSConstants.USERNAME_TOKEN_LN, wsseNS);
        OMElement usernameElement = factory.createOMElement(WSConstants.USERNAME_LN, wsseNS);
        usernameElement.setText(username);
        usernameTokenElement.addChild(usernameElement);
        OMElement passwordElement = factory.createOMElement(WSConstants.PASSWORD_LN, wsseNS);
        passwordElement.setText(password);
        passwordElement.addAttribute(WSConstants.PASSWORD_TYPE_ATTR, WSConstants.PASSWORD_TEXT, null);
        usernameTokenElement.addChild(passwordElement);
        OMElement securityHeader = factory.createOMElement("Security", wsseNS);
        securityHeader.addAttribute("mustUnderstand", "1", null);
        securityHeader.addChild(usernameTokenElement);
        return securityHeader;
    }

}