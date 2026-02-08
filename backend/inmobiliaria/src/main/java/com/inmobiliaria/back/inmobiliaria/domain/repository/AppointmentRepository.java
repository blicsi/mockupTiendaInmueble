package com.inmobiliaria.back.inmobiliaria.domain.repository;

import com.inmobiliaria.back.inmobiliaria.domain.entities.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment,Long> {
}
