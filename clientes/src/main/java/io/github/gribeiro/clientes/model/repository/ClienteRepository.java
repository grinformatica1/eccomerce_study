package io.github.gribeiro.clientes.model.repository;

import io.github.gribeiro.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClienteRepository extends JpaRepository<Cliente, UUID> {

}
