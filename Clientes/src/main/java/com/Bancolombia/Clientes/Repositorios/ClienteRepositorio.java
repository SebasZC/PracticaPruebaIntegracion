package com.Bancolombia.Clientes.Repositorios;

import com.Bancolombia.Clientes.Modelos.Cliente;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClienteRepositorio extends CrudRepository<Cliente, Integer> {

    List<Cliente> findAll();

}
