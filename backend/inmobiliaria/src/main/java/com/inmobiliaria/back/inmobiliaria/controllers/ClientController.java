package com.inmobiliaria.back.inmobiliaria.controllers;

import com.inmobiliaria.back.inmobiliaria.domain.entities.Client;
import com.inmobiliaria.back.inmobiliaria.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clients")
@RequiredArgsConstructor
public class ClientController {

    private final ClientService service;

    @GetMapping
    public List<Client> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Client getById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public Client create(@RequestBody Client client) {
        return service.save(client);
    }

    @PutMapping("/{id}")
    public Client update(@PathVariable Long id, @RequestBody Client client) {
        return service.update(id, client);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}