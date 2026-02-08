package com.inmobiliaria.back.inmobiliaria.controllers;

import com.inmobiliaria.back.inmobiliaria.domain.entities.Transaction;
import com.inmobiliaria.back.inmobiliaria.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transactions")
@RequiredArgsConstructor
public class TransactionController {

    private final TransactionService service;

    @GetMapping
    public List<Transaction> getAll() {
        return service.findAll();
    }

    @PostMapping
    public Transaction create(@RequestBody Transaction transaction) {
        return service.save(transaction);
    }
}
