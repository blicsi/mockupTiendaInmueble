package com.inmobiliaria.back.inmobiliaria.domain.repository;


import com.inmobiliaria.back.inmobiliaria.domain.entities.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestRepository extends JpaRepository<Test,Long> {
    public List<Test> findByNombre(String nombre);
}
