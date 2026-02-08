package com.inmobiliaria.back.inmobiliaria.domain.repository;

import com.inmobiliaria.back.inmobiliaria.domain.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction,Long> {
}
