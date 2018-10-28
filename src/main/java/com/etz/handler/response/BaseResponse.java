/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.etz.handler.response;

import javax.xml.bind.annotation.XmlAttribute;

/**
 *
 * @author Cyprian Omenuko
 */
public class BaseResponse {
    @XmlAttribute(name = "SessionId")
    private String sessionId;
    @XmlAttribute(name = "ResponseCode")
    private String responseCode;

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }   
}
