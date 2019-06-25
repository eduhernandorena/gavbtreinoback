package com.cad.ws.cnpj.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/address")
public class AddressController {

    @GetMapping
    public String getAddress() {
        return "Consulta de Endereco";
    }

}
