package com.company.billing.controllers;

import com.company.billing.model.Client;
import com.company.billing.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MainController {
    @Autowired
    private ClientRepository clientRepository;

    @RequestMapping("/all")
    public List<Client> ivanAction() {
        return clientRepository.findAll();
    }

}
