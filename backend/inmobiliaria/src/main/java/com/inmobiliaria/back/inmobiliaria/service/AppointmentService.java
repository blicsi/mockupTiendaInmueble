package com.inmobiliaria.back.inmobiliaria.service;

import com.inmobiliaria.back.inmobiliaria.domain.entities.Appointment;

import java.util.List;

public interface AppointmentService {
    List<Appointment>findAll();
    Appointment findById(Long id);
    Appointment save (Appointment appointment);
    void delete (Long id);
}
