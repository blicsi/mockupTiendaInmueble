package com.inmobiliaria.back.inmobiliaria.service.impl;

import com.inmobiliaria.back.inmobiliaria.domain.entities.Agent;
import com.inmobiliaria.back.inmobiliaria.domain.repository.AgentRepository;
import com.inmobiliaria.back.inmobiliaria.service.AgentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AgentServiceImpl implements AgentService {

    private final AgentRepository repository;

    public List<Agent> findAll() {
        return repository.findAll();
    }

    public Agent findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Agent not found"));
    }

    public Agent save(Agent agent) {
        return repository.save(agent);
    }

    public Agent update(Long id, Agent agent) {

        Agent existing = findById(id);

        existing.setName(agent.getName());
        existing.setEmail(agent.getEmail());
        existing.setPhone(agent.getPhone());

        return repository.save(existing);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
