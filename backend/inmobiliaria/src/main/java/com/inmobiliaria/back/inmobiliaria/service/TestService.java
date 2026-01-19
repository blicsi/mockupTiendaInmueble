package com.inmobiliaria.back.inmobiliaria.service;

import com.inmobiliaria.back.inmobiliaria.domain.entities.Test;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface TestService {
    List<Test> findAll();
    List<Test>findByNombre(String nombre);
}
