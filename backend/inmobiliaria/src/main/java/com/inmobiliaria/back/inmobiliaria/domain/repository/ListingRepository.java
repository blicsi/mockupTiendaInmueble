package com.inmobiliaria.back.inmobiliaria.domain.repository;

import com.inmobiliaria.back.inmobiliaria.domain.entities.Listing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListingRepository extends JpaRepository<Listing,Long> {
}
