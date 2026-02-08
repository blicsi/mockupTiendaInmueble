package com.inmobiliaria.back.inmobiliaria.service;

import com.inmobiliaria.back.inmobiliaria.domain.entities.Property;

import java.util.List;

public interface PropertyService {

    List<Property> findAll();
    Property findById(Long id);
    Property save(Property property);
    Property update(Long id, Property property);
    void delete(Long id);
}
