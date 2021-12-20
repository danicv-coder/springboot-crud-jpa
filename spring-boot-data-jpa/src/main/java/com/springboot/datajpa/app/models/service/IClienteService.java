package com.springboot.datajpa.app.models.service;

import com.springboot.datajpa.app.models.entity.Cliente;

import java.util.List;

public interface IClienteService {
    List<Cliente> listar();

    Cliente porId(Long id);

    void save(Cliente cliente);

    void eliminar(Long id);
}
