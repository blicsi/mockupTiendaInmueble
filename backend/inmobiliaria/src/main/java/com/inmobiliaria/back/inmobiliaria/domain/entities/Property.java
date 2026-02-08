package com.inmobiliaria.back.inmobiliaria.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long propertyId;

    private String address;
    private String type;
    private Double size;
    private Double price;
    private String status;
}
