package com.cad.ws.cnpj.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Company extends Client {
    private String cnpj;
    private String status;
    @JsonProperty("capital_social")
    private double money;
    @JsonProperty("tipo")
    private String type;
    @JsonProperty("natureza_juridica")
    private String nature;
    @JsonProperty("porte")
    private String size;
    @JsonProperty("fantasia")
    private String commercialName;
    @JsonProperty("nome")
    private String realName;
    @OneToMany
    @JsonProperty("atividade_principal")
    private List<Activity> mainActivity = new ArrayList<>();
    @OneToMany
    @JsonProperty("atividades_secundarias")
    private List<Activity> secondaryActivities = new ArrayList<>();
    @OneToMany
    @JsonProperty("qsa")
    private List<Partners> partners = new ArrayList<>();

    public Company() {
    }

    public Company(String active, String email, String phone) {
        super.setEmail(email);
        super.setActive(active);
        super.setPhone(phone);
    }

}
