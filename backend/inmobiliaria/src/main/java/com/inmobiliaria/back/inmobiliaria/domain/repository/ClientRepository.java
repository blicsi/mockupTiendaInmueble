package com.inmobiliaria.back.inmobiliaria.domain.repository;

import com.inmobiliaria.back.inmobiliaria.domain.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
