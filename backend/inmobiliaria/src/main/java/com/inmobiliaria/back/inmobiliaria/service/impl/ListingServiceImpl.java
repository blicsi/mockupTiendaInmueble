package com.inmobiliaria.back.inmobiliaria.service.impl;

import com.inmobiliaria.back.inmobiliaria.domain.entities.Agent;
import com.inmobiliaria.back.inmobiliaria.domain.entities.Listing;
import com.inmobiliaria.back.inmobiliaria.domain.entities.Property;
import com.inmobiliaria.back.inmobiliaria.domain.repository.AgentRepository;
import com.inmobiliaria.back.inmobiliaria.domain.repository.ListingRepository;
import com.inmobiliaria.back.inmobiliaria.domain.repository.PropertyRepository;
import com.inmobiliaria.back.inmobiliaria.service.ListingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ListingServiceImpl implements ListingService {

    private final ListingRepository listingRepository;
    private final PropertyRepository propertyRepository;
    private final AgentRepository agentRepository;

    public List<Listing> findAll() {
        return listingRepository.findAll();
    }

    public Listing findById(Long id) {
        return listingRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Listing not found"));
    }

    public Listing save(Listing listing) {

        Property property = propertyRepository.findById(
                listing.getProperty().getPropertyId()
        ).orElseThrow(() -> new RuntimeException("Property not found"));

        Agent agent = agentRepository.findById(
                listing.getAgent().getAgentId()
        ).orElseThrow(() -> new RuntimeException("Agent not found"));

        listing.setProperty(property);
        listing.setAgent(agent);

        return listingRepository.save(listing);
    }

    public Listing update(Long id, Listing listing) {

        Listing existing = findById(id);

        existing.setDateListed(listing.getDateListed());

        return listingRepository.save(existing);
    }

    public void delete(Long id) {
        listingRepository.deleteById(id);
    }
}
//