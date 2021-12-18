package com.springboot.datajpa.app.models.dao;

import com.springboot.datajpa.app.models.entity.Cliente;

import java.util.List;

public interface IClienteDao {
    List<Cliente> listar();
}
