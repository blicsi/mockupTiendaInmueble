package com.inmobiliaria.back.inmobiliaria.domain.entities;

import jakarta.persistence.*;

@Table(name = "AGENT")
@Entity
public class Agent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ClientId;
    private String Name;
    private  String Email;
    private  String Phone;

    public long getClientId() {
        return ClientId;
    }

    public void setClientId(long clientId) {
        ClientId = clientId;
    }
}
