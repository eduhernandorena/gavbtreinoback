package com.cad.ws.cnpj.controller;

import com.cad.ws.cnpj.models.Person;
import com.cad.ws.cnpj.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@RestController

@RequestMapping("/person")
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @GetMapping(value = "/{cnpj}", produces = "application/json")
    public Object getPersonS(@PathVariable String cnpj) {
        Optional<Person> optPerson = personRepository.findByCpf(cnpj);
        return optPerson.orElse(null);
    }

    @PostMapping(produces = "application/json", consumes = "application/json")
    @GetMapping
    public List<Person> getCompanies() {
        return personRepository.findAll();
    }

}
