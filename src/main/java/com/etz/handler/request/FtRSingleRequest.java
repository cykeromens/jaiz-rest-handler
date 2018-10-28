/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.etz.handler.request;

import javax.xml.bind.annotation.XmlAttribute;

/**
 *
 * @author Cyprian Omenuko
 */
public class FtRSingleRequest {
    
    @XmlAttribute(name = "SessionID")
    private String sessionId;

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
    
    
}
