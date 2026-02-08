package com.inmobiliaria.back.inmobiliaria.service;

import com.inmobiliaria.back.inmobiliaria.domain.entities.Agent;

import java.util.List;

public interface AgentService {
    List<Agent> findAll();
    Agent findById(Long id);
    Agent save(Agent agent);
    Agent update(Long id, Agent agent);
    void delete(Long id);
}
