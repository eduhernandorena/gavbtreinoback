package com.cad.ws.cnpj.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/partner")
@CrossOrigin(origins = "http://localhost:4200")
public class PartnersController {

    @GetMapping
    public String getPartner() {
        return "Consulta de Socios";
    }
}
