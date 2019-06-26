package com.cad.ws.cnpj.controller;

import com.cad.ws.cnpj.models.Company;
import com.cad.ws.cnpj.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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

    @GetMapping
    public List<Company> pesquisar(Company company) {
        // ModelAndView modelAndView = new ModelAndView("clients");

        // modelAndView.addObject("client", clientRepository.filtrar(client));

        return companyRepository.filtrar(company);
    }

}
