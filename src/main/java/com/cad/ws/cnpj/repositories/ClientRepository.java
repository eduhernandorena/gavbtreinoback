package com.cad.ws.cnpj.repositories;

import com.cad.ws.cnpj.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

//    Optional<Client> findByCnpj(String cnpj);
}
