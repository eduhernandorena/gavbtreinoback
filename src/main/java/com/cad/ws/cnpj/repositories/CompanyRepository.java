package com.cad.ws.cnpj.repositories;

import com.cad.ws.cnpj.models.Company;
import com.cad.ws.cnpj.repositories.helper.CompanyRepositoryQueries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface CompanyRepository extends JpaRepository<Company, Long>, CompanyRepositoryQueries {

    Optional<Company> findByCnpj(String cnpj);
}
