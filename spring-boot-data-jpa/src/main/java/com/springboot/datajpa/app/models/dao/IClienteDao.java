package com.springboot.datajpa.app.models.dao;

import com.springboot.datajpa.app.models.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IClienteDao extends CrudRepository<Cliente, Long> {

}
