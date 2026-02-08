package com.inmobiliaria.back.inmobiliaria.controllers;

import com.inmobiliaria.back.inmobiliaria.domain.entities.Agent;
import com.inmobiliaria.back.inmobiliaria.service.AgentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/agents")
@RequiredArgsConstructor
public class AgentController {

    private final AgentService service;

    @GetMapping
    public List<Agent> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Agent getById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public Agent create(@RequestBody Agent agent) {
        return service.save(agent);
    }

    @PutMapping("/{id}")
    public Agent update(@PathVariable Long id, @RequestBody Agent agent) {
        return service.update(id, agent);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
