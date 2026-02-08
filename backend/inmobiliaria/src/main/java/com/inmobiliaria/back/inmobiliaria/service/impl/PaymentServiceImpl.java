package com.inmobiliaria.back.inmobiliaria.service.impl;

import com.inmobiliaria.back.inmobiliaria.domain.entities.Payment;
import com.inmobiliaria.back.inmobiliaria.domain.entities.Transaction;
import com.inmobiliaria.back.inmobiliaria.domain.repository.PaymentRepository;
import com.inmobiliaria.back.inmobiliaria.domain.repository.TransactionRepository;
import com.inmobiliaria.back.inmobiliaria.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {

    private final PaymentRepository paymentRepository;
    private final TransactionRepository transactionRepository;

    public List<Payment> findAll() {
        return paymentRepository.findAll();
    }

    public Payment save(Payment payment) {

        Transaction transaction = transactionRepository.findById(
                payment.getTransaction().getTransactionId()
        ).orElseThrow();

        payment.setTransaction(transaction);

        return paymentRepository.save(payment);
    }
}
