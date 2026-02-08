package com.inmobiliaria.back.inmobiliaria.service.impl;

import com.inmobiliaria.back.inmobiliaria.domain.entities.Client;
import com.inmobiliaria.back.inmobiliaria.domain.repository.ClientRepository;
import com.inmobiliaria.back.inmobiliaria.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final ClientRepository repository;

    @Override
    public List<Client> findAll() {
        return repository.findAll();
    }

    @Override
    public Client findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Client not found"));
    }

    @Override
    public Client save(Client client) {
        return repository.save(client);
    }

    @Override
    public Client update(Long id, Client client) {

        Client existing = findById(id);

        existing.setName(client.getName());
        existing.setRole(client.getRole());
        existing.setEmail(client.getEmail());
        existing.setPhone(client.getPhone());

        return repository.save(existing);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
