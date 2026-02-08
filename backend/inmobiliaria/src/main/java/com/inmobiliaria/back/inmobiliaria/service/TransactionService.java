package com.inmobiliaria.back.inmobiliaria.service;

import com.inmobiliaria.back.inmobiliaria.domain.entities.Transaction;

import java.util.List;

public interface TransactionService {
    List <Transaction> findAll();
    Transaction save(Transaction transaction);
}
