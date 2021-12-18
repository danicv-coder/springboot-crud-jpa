package com.springboot.datajpa.app.models.dao;

import com.springboot.datajpa.app.models.entity.Cliente;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class ClienteDaoImpl implements IClienteDao {
    @PersistenceContext
    private EntityManager em;

    @Transactional()
    @Override
    public List<Cliente> listar() {
        return em.createQuery("from Cliente", Cliente.class).getResultList();
    }
}
