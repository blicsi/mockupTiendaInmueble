package com.inmobiliaria.back.inmobiliaria.controllers;

import com.inmobiliaria.back.inmobiliaria.domain.entities.Property;
import com.inmobiliaria.back.inmobiliaria.service.PropertyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/properties")
@RequiredArgsConstructor
public class PropertyController {

    private final PropertyService service;

    @GetMapping
    public List<Property> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Property getById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public Property create(@RequestBody Property property) {
        return service.save(property);
    }

    @PutMapping("/{id}")
    public Property update(@PathVariable Long id, @RequestBody Property property) {
        return service.update(id, property);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}