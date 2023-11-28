package io.github.tcc_2023.clientes.model.repository;

import io.github.tcc_2023.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
