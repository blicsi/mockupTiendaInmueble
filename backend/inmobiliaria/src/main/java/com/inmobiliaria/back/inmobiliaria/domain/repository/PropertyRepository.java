package com.inmobiliaria.back.inmobiliaria.domain.repository;

import com.inmobiliaria.back.inmobiliaria.domain.entities.Property;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyRepository extends JpaRepository<Property,Long> {
}
