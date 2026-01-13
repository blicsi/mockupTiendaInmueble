package com.inmobiliaria.back.inmobiliaria.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class testController {
    @GetMapping("/")
    public ResponseEntity<?> getAlll(){
        return ResponseEntity.ok("test");
    }
}
