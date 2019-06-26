package com.cad.ws.cnpj.repositories.helper;

import com.cad.ws.cnpj.models.Company;

import java.util.List;

public interface CompanyRepositoryQueries {

    public List<Company> filtrar(Company company);
}
