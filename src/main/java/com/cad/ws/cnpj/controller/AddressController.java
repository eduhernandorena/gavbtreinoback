package com.cad.ws.cnpj.controller;

import com.cad.ws.cnpj.models.Address;
import com.cad.ws.cnpj.repositories.AddressRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/address")
public class AddressController {

    private AddressRepository addressRepository;

    @GetMapping(produces = "application/json")
    public List<Address> getAdresses() {
        return addressRepository.findAll();
    }

    @PostMapping(value = "/add", consumes = "application/json", produces = "application/json")
    public Address addAddress(Address address){
        return addressRepository.save(address);
    }
}
