package com.Bancolombia.Clientes.Servicios;

import com.Bancolombia.Clientes.Modelos.Cliente;
import com.Bancolombia.Clientes.Repositorios.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServicio {

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    public void crearCliente(Cliente cliente){
        cliente.setSaldo(0.0);
        clienteRepositorio.save(cliente);
    }

    public List<Cliente> getCliente(){
        return clienteRepositorio.findAll();
    }

    public Optional<Cliente> findById(int id){
        return clienteRepositorio.findById(id);
    }

}
