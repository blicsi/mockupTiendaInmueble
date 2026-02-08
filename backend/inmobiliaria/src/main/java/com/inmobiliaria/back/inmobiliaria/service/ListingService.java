package com.inmobiliaria.back.inmobiliaria.service;

import com.inmobiliaria.back.inmobiliaria.domain.entities.Listing;

import java.util.List;

public interface ListingService {

    List<Listing> findAll();
    Listing findById(Long id);
    Listing save(Listing listing);
    Listing update(Long id, Listing listing);
    void delete(Long id);
}