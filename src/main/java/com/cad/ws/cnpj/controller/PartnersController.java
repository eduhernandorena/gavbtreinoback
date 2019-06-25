package com.cad.ws.cnpj.controller;

import com.cad.ws.cnpj.models.Activity;
import com.cad.ws.cnpj.models.Partners;
import com.cad.ws.cnpj.repositories.ActivityRepository;
import com.cad.ws.cnpj.repositories.PartnersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/partner")
public class PartnersController {

    @Autowired
    private PartnersRepository repository;

    @PostMapping(value = "/add", consumes = "application/json", produces = "application/json")
    public Partners addPartners(@RequestBody Partners partners) {
        return repository.save(partners);
    }

    @GetMapping(produces = "application/json")
    public List<Partners> getPartners(){
        return repository.findAll();
    }
}
