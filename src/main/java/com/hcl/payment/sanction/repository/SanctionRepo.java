package com.hcl.payment.sanction.repository;

import com.hcl.payment.sanction.entity.Sanction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SanctionRepo extends JpaRepository<Sanction, Long> {
    @Query("select  t from Sanction t where creditorName = :creditorName")
    Sanction findCreditorInSanction(String creditorName);
}
