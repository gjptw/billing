package com.company.billing.controllers;

import com.company.billing.model.Client;
import com.company.billing.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/clients")
public class MainController {
    @Autowired
    private ClientRepository clientRepository;

    @GetMapping
    public ResponseEntity<List<Client>> ivanAction() {
        return entityWithContent(clientRepository.findAll());
    }

    private static <T> ResponseEntity<T> entityWithContent(T t) {
        return Optional.ofNullable(t)
                .map(content -> ResponseEntity.status(HttpStatus.OK).body(content))
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

}
