package com.inmobiliaria.back.inmobiliaria.service.impl;

import com.inmobiliaria.back.inmobiliaria.domain.entities.Property;
import com.inmobiliaria.back.inmobiliaria.domain.repository.PropertyRepository;
import com.inmobiliaria.back.inmobiliaria.service.PropertyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PropertyServiceImpl implements PropertyService {

    private final PropertyRepository repository;

    public List<Property> findAll() {
        return repository.findAll();
    }

    public Property findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Property not found"));
    }

    public Property save(Property property) {
        return repository.save(property);
    }

    public Property update(Long id, Property property) {

        Property existing = findById(id);

        existing.setAddress(property.getAddress());
        existing.setType(property.getType());
        existing.setSize(property.getSize());
        existing.setPrice(property.getPrice());
        existing.setStatus(property.getStatus());

        return repository.save(existing);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
