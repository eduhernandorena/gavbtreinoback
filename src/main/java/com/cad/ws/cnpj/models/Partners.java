package com.cad.ws.cnpj.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Partners {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Long id;
    @JsonProperty("qual")
    private String codeDescription;
    @JsonProperty("nome")
    private String name;

    public Partners() {
    }

    public Partners(String codeDescription, String name) {
        this.codeDescription = codeDescription;
        this.name = name;
    }
}
