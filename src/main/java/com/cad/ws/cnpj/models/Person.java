package com.cad.ws.cnpj.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Person extends Client {
    private String cpf;
    private String name;

    public Person() {
    }
}
