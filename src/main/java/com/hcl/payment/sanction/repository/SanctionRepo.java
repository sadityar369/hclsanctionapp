package com.hcl.payment.sanction.repository;

import com.hcl.payment.sanction.entity.Sanction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SanctionRepo extends JpaRepository<Sanction, Long> {
}
