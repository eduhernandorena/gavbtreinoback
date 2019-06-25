package com.cad.ws.cnpj.controller;

import com.cad.ws.cnpj.models.*;
import com.cad.ws.cnpj.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@RestController

@RequestMapping("/company")
public class CompanyController {

    @Autowired
    CompanyRepository companyRepository;

    @GetMapping(value = "/{cnpj}", produces = "application/json")
    public Object getCompanyS(@PathVariable String cnpj) {
        Optional<Company> optCompany = companyRepository.findByCnpj(cnpj);
        if (optCompany.isPresent()) {
            return optCompany.get();
        } else {
            RestTemplate template = new RestTemplate();
            return template.getForObject("https://www.receitaws.com.br/v1/cnpj/{cnpj}", String.class, cnpj);
        }
    }

    @PostMapping(produces = "application/json", consumes = "application/json")
    @GetMapping
    public List<Company> getCompanies() {
        return companyRepository.findAll();
    }

}
