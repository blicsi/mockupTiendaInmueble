package com.inmobiliaria.back.inmobiliaria.service.impl;

import com.inmobiliaria.back.inmobiliaria.domain.entities.Client;
import com.inmobiliaria.back.inmobiliaria.domain.entities.Property;
import com.inmobiliaria.back.inmobiliaria.domain.entities.Transaction;
import com.inmobiliaria.back.inmobiliaria.domain.repository.ClientRepository;
import com.inmobiliaria.back.inmobiliaria.domain.repository.PropertyRepository;
import com.inmobiliaria.back.inmobiliaria.domain.repository.TransactionRepository;
import com.inmobiliaria.back.inmobiliaria.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TransactionServiceImpl implements TransactionService {

    private final TransactionRepository transactionRepository;
    private final PropertyRepository propertyRepository;
    private final ClientRepository clientRepository;

    public List<Transaction> findAll() {
        return transactionRepository.findAll();
    }

    public Transaction save(Transaction transaction) {

        Property property = propertyRepository.findById(
                transaction.getProperty().getPropertyId()
        ).orElseThrow();

        Client buyer = clientRepository.findById(
                transaction.getBuyer().getClientId()
        ).orElseThrow();

        Client seller = clientRepository.findById(
                transaction.getSeller().getClientId()
        ).orElseThrow();

        transaction.setProperty(property);
        transaction.setBuyer(buyer);
        transaction.setSeller(seller);

        return transactionRepository.save(transaction);
    }
}
