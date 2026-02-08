package com.inmobiliaria.back.inmobiliaria.controllers;

import com.inmobiliaria.back.inmobiliaria.domain.entities.Listing;
import com.inmobiliaria.back.inmobiliaria.service.ListingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/listings")
@RequiredArgsConstructor
public class ListingController {

    private final ListingService service;

    @GetMapping
    public List<Listing> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Listing getById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public Listing create(@RequestBody Listing listing) {
        return service.save(listing);
    }

    @PutMapping("/{id}")
    public Listing update(@PathVariable Long id, @RequestBody Listing listing) {
        return service.update(id, listing);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
