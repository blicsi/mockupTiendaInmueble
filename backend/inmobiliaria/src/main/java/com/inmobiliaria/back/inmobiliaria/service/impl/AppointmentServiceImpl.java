package com.inmobiliaria.back.inmobiliaria.service.impl;

import com.inmobiliaria.back.inmobiliaria.domain.entities.Appointment;
import com.inmobiliaria.back.inmobiliaria.domain.entities.Client;
import com.inmobiliaria.back.inmobiliaria.domain.entities.Listing;
import com.inmobiliaria.back.inmobiliaria.domain.repository.AppointmentRepository;
import com.inmobiliaria.back.inmobiliaria.domain.repository.ClientRepository;
import com.inmobiliaria.back.inmobiliaria.domain.repository.ListingRepository;
import com.inmobiliaria.back.inmobiliaria.service.AppointmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AppointmentServiceImpl implements AppointmentService {

    private final AppointmentRepository appointmentRepository;
    private final ClientRepository clientRepository;
    private final ListingRepository listingRepository;

    public List<Appointment> findAll() {
        return appointmentRepository.findAll();
    }

    public Appointment findById(Long id) {
        return appointmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Appointment not found"));
    }

    public Appointment save(Appointment appointment) {

        Client client = clientRepository.findById(
                appointment.getClient().getClientId()
        ).orElseThrow();

        Listing listing = listingRepository.findById(
                appointment.getListing().getListingId()
        ).orElseThrow();

        appointment.setClient(client);
        appointment.setListing(listing);

        return appointmentRepository.save(appointment);
    }

    public void delete(Long id) {
        appointmentRepository.deleteById(id);
    }
}
