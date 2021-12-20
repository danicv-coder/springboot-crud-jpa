package com.springboot.datajpa.app.models.service;

import com.springboot.datajpa.app.models.dao.IClienteDao;
import com.springboot.datajpa.app.models.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ClienteServiceImpl implements IClienteService {
    @Autowired
    private IClienteDao clienteDao;

    @Override
    @Transactional()
    public List<Cliente> listar() {
        return (List<Cliente>) clienteDao.findAll();
    }

    @Override
    @Transactional()
    public Cliente porId(Long id) {
        return clienteDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void save(Cliente cliente) {
        clienteDao.save(cliente);
    }

    @Override
    @Transactional
    public void eliminar(Long id) {
        clienteDao.deleteById(id);
    }
}
