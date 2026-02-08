package com.inmobiliaria.back.inmobiliaria.service;

import com.inmobiliaria.back.inmobiliaria.domain.entities.Payment;

import java.util.List;

public interface PaymentService {
    List<Payment> findAll();
    Payment save(Payment payment);
}
