package com.inmobiliaria.back.inmobiliaria.service;

import com.inmobiliaria.back.inmobiliaria.domain.entities.Client;

import java.util.List;

public interface ClientService {

    List<Client> findAll();
    Client findById(Long id);
    Client save(Client client);
    Client update(Long id, Client client);
    void delete(Long id);
}
