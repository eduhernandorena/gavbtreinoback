package com.cad.ws.cnpj.repositories;

import com.cad.ws.cnpj.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person, Long> {

    Optional<Person> findByCpf(String cpf);
}
