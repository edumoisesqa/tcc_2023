package io.github.tcc_2023.clientes.model.repository;

import io.github.tcc_2023.clientes.model.entity.ServicosPrestados;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<ServicosPrestados, Integer> {
}
