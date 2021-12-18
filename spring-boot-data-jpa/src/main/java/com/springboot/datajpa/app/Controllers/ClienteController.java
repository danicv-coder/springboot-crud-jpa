package com.springboot.datajpa.app.Controllers;

import com.springboot.datajpa.app.models.dao.ClienteDaoImpl;
import com.springboot.datajpa.app.models.dao.IClienteDao;
import com.springboot.datajpa.app.models.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClienteController {
    @Autowired
    private IClienteDao clienteDao;

    @GetMapping("/listar")
    public String listar(Model model) {
        model.addAttribute("titulo", "Listado de clientes");
        model.addAttribute("clientes", clienteDao.listar());
        return "listar";
    }
}
