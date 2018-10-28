/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.etz.handler.request;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Cyprian Omenuko
 */
@XmlRootElement(name = "FTSingleRequest")
public class FtSingleRequest extends FtRSingleRequest{
   
    @XmlAttribute(name = "DebitAccountNumber")
    private String debitAccountNumber;
    @XmlAttribute(name = "CreditAccountNumber")
    private String creditAccountNumber;
    @XmlAttribute(name = "ChannelCode")
    private String channelCode;
    @XmlAttribute(name = "Narration")
    private String narration;
    @XmlAttribute(name = "Amount")
    private String amount;
    @XmlAttribute(name = "Fee")
    private String fee;

    public String getDebitAccountNumber() {
        return debitAccountNumber;
    }

    public void setDebitAccountNumber(String debitAccountNumber) {
        this.debitAccountNumber = debitAccountNumber;
    }

    public String getCreditAccountNumber() {
        return creditAccountNumber;
    }

    public void setCreditAccountNumber(String creditAccountNumber) {
        this.creditAccountNumber = creditAccountNumber;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public String getNarration() {
        return narration;
    }

    public void setNarration(String narration) {
        this.narration = narration;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }
    
    
}
