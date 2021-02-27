package com.hcl.payment.sanction;

import com.hcl.payment.sanction.entity.Sanction;
import com.hcl.payment.sanction.repository.SanctionRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SanctionApplication  implements CommandLineRunner {
    private static final Logger log = LoggerFactory.getLogger(SanctionApplication.class);
    @Autowired
    SanctionRepo sanctionRepo;

    public static void main(String[] args) {
        log.info("Sanction module started");
        SpringApplication.run(SanctionApplication.class, args);
        log.info("Sanction module END");
    }
    @Override
    public void run(String... args) {
        Sanction s = new Sanction();
        // I am reading the sanction details from mySQL table - t_sanction
//        s.setTransactionID(1);
//        s.setMessageId(1);
//        s.setE2eId(1);
//        s.setDebtorAccount("123456");
//        s.setDebtorName("debtorName");;
//        s.setDebtorAddress("debtorAddress");;
//        s.setDebtorAgentId("debtorAgentId");;
//        //s.setCreditorAccount("creditorAccount");;
//        s.setCreditorName("creditorName");;
//        s.setCreditorAddress("creditorADRESS");
//        s.setCreditorAgentId("creditorAgentId");
//        s.setPaymentCurrency("USA");
//        s.setPaymentAmount("100.55");
//        s.setValueDate("02/27/2020");
//        s.setRemittanceInfo("RemittanceInfo");
        //sanctionRepo.save(s);
        try {
        sanctionRepo.findAll().forEach(x -> System.out.println(x));
        }catch (Exception e){
            log.error(e.getMessage());
        }

    }

}
