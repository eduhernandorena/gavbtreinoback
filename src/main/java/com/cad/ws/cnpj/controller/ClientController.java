package com.cad.ws.cnpj.controller;

import com.cad.ws.cnpj.models.*;
import com.cad.ws.cnpj.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.text.ParseException;
import java.text.SimpleDateFormat;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/client")
public class ClientController {

    @Autowired
    ClientRepository clientRepository;

    @GetMapping(value = "/company/{cnpj}", produces = "application/json")
    public Object getCompanyS(@PathVariable String cnpj) throws ParseException {
        if(cnpj.equals("00101032000183")){
            Company c = new Company();
            c.setCnpj("00.101.032/0001-83");
            c.setCommercialName("Aph Consultoria");
            c.setRealName("APH CONSULTORIA & SISTEMAS LTDA");
            c.setSize("Micro Empresa");
            c.setMoney(20000d);
            c.setNature("206-2 - Sociedade Empresaria Limitada");
            c.setStatus("Ok");
            c.setType("Matriz");
            c.setActive("Ativa");
            c.setEmail("csperdomo@gmail.com");
            c.setId(1L);
            c.setStart(new SimpleDateFormat("dd/MM/yyyy").parse("26/08/1994"));
            c.setPhone("(53) 3027-6001");
            c.getMainActivity().add(new Activity("62.01-5-01", "Desenvolvimento de programas de computador sob encomenda"));
            c.getSecondaryActivities().add(new Activity("62.02-3-00", "Desenvolvimento e licenciamento de programas de computador customizáveis"));
            c.getSecondaryActivities().add(new Activity("62.04-0-00", "Consultoria em tecnologia da informação"));
            c.getPartners().add(new Partners("22-Sócio", "VIDALQUINA COELHO PERDOMO"));
            c.getPartners().add(new Partners("49-Sócio-Administrador", "ANTONIO CESAR SOARES PERDOMO"));

            Address a = new Address();
            a.setCep("96020-152");
            a.setCity("Pelotas");
            a.setComplement("Sala 17-C");
            a.setDistrict("Três Vendas");
            a.setNumber(21L);
            a.setState("RS");
            a.setStreet("Av. Fernando Osorio");

            c.setAddress(a);
            return c;
        }else {
            RestTemplate template = new RestTemplate();
            return template.getForObject("https://www.receitaws.com.br/v1/cnpj/{cnpj}", String.class, cnpj);
        }
    }

}
