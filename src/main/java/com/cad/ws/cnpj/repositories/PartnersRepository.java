package com.cad.ws.cnpj.repositories;

import com.cad.ws.cnpj.models.Partners;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartnersRepository extends JpaRepository<Partners, Long> {
}
