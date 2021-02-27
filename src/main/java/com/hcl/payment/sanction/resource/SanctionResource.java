package com.hcl.payment.sanction.resource;

import com.hcl.payment.sanction.entity.Sanction;
import com.hcl.payment.sanction.exception.SanctionException;
import com.hcl.payment.sanction.repository.SanctionRepo;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api")
public class SanctionResource {


    @Autowired
    SanctionRepo sanctionRepo;

    @GetMapping("/sanction/{creditorName}")
    public String getSanctionCheck(@PathVariable String creditorName) throws SanctionException {

        try {
            Sanction sanction = sanctionRepo.findCreditorInSanction(creditorName);
            System.out.printf("sanction");
            if (null != sanction && sanction.getCreditorName().equalsIgnoreCase(creditorName)) {
                return "creditor name :" + creditorName + "Complience hit";
            } else {
                return "creditor name :" + creditorName + " Transaction success";

            }

        } catch (Exception e) {
            throw new SanctionException("ERROR in getSanctionCheck "+e.getMessage());

        }

    }
}
