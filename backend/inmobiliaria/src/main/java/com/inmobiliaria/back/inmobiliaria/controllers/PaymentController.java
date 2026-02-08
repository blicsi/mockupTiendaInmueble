package com.inmobiliaria.back.inmobiliaria.controllers;

import com.inmobiliaria.back.inmobiliaria.domain.entities.Payment;
import com.inmobiliaria.back.inmobiliaria.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payments")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService service;

    @GetMapping
    public List<Payment> getAll() {
        return service.findAll();
    }

    @PostMapping
    public Payment create(@RequestBody Payment payment) {
        return service.save(payment);
    }
}
