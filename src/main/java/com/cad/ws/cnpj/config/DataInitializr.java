package com.cad.ws.cnpj.config;

import com.cad.ws.cnpj.models.Company;
import com.cad.ws.cnpj.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DataInitializr implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        this.createUsers("True", "viniciusmendes.gavb.com.br", "99117268");
        this.createUsers("True", "Eduardo.gavb.com.br", "597752152");
    }

    public void createUsers(String active, String email, String phone) {

        Company company = new Company(active, email, phone);
        companyRepository.save(company);
    }
}
