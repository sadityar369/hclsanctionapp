package com.hcl.payment.sanction.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "t_sanction")
public class Sanction {
    @Id
    private int transactionID;
    private int messageId;
    private int e2eId;
    private String debtorAccount;
    private String debtorName;
    private String debtorAddress;
    private String debtorAgentId;
    private String creditorAccount;
    private String creditorName;
    private String creditorAddress;
    private String creditorAgentId;
    private String paymentCurrency;
    private String paymentAmount;
    private String valueDate;
    private String remittanceInfo;

    public Sanction() {
    }

    public Sanction(int messageId, int transactionID, int e2eId, String debtorAccount, String debtorName, String debtorAddress, String debtorAgentId, String creditorAccount, String creditorName, String creditorAddress, String creditorAgentId, String paymentCurrency, String paymentAmount, String valueDate, String remittanceInfo) {
        this.messageId = messageId;
        this.transactionID = transactionID;
        this.e2eId = e2eId;
        this.debtorAccount = debtorAccount;
        this.debtorName = debtorName;
        this.debtorAddress = debtorAddress;
        this.debtorAgentId = debtorAgentId;
        this.creditorAccount = creditorAccount;
        this.creditorName = creditorName;
        this.creditorAddress = creditorAddress;
        this.creditorAgentId = creditorAgentId;
        this.paymentCurrency = paymentCurrency;
        this.paymentAmount = paymentAmount;
        this.valueDate = valueDate;
        this.remittanceInfo = remittanceInfo;
    }
}
