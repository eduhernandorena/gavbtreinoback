package com.cad.ws.cnpj.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Long id;
    @JsonProperty("situacao")
    private String active;
    private String email;
    @JsonProperty("abertura")
    @Temporal(TemporalType.DATE)
    private Date start;
    @ManyToOne
    @JoinColumn(name = "client_id")
    @JsonProperty("endereco")
    private Address address;
    @JsonProperty("telefone")
    private String phone;

}
