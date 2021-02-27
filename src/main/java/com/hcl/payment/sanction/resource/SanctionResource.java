package com.hcl.payment.sanction.resource;

import com.hcl.payment.sanction.entity.Sanction;
import com.hcl.payment.sanction.repository.SanctionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SanctionResource {

    @Autowired
    SanctionRepo sanctionRepo;

    @GetMapping("/sanction")
    public List<Sanction> getAllComments() {
        return sanctionRepo.findAll();
    }
}
