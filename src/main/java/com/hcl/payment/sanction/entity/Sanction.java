package com.hcl.payment.sanction.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "t_sanction")
public class Sanction {
    @Id
    @Column(name = "transaction_id")
    private int transactionID;

    @Column(name = "message_id")
    private int messageId;

    @Column(name = "e2e_id")
    private int e2eId;

    @Column(name = "debtor_account")
    private String debtorAccount;

    @Column(name = "debtor_name")
    private String debtorName;

    @Column(name = "debtor_address")
    private String debtorAddress;

    @Column(name = "debtor_agentid")
    private String debtorAgentId;

    @Column(name = "creditor_account")
    private String creditorAccount;

    @Column(name = "creditor_name")
    private String creditorName;

    @Column(name = "creditor_address")
    private String creditorAddress;

    @Column(name = "creditor_agentid")
    private String creditorAgentId;

    @Column(name = "payment_currency")
    private String paymentCurrency;

    @Column(name = "payment_amount")
    private String paymentAmount;

    @Column(name = "value_date")
    private String valueDate;

    @Column(name = "remittance_info")
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
//        this.creditorAccount = creditorAccount;
        this.creditorName = creditorName;
        this.creditorAddress = creditorAddress;
        this.creditorAgentId = creditorAgentId;
        this.paymentCurrency = paymentCurrency;
        this.paymentAmount = paymentAmount;
        this.valueDate = valueDate;
        this.remittanceInfo = remittanceInfo;
    }
}
