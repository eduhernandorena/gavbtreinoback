package com.cad.ws.cnpj.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Long id;
    @JsonProperty("logradouro")
    private String street;
    @JsonProperty("numero")
    private Long number;
    @JsonProperty("complemento")
    private String complement;
    @JsonProperty("bairro")
    private String district;
    private String cep;
    @JsonProperty("uf")
    private String state;
    @JsonProperty("cidade")
    private String city;

    public Address() {
    }
}
