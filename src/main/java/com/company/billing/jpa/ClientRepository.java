package com.company.billing.jpa;

import com.company.billing.model.Client;

import java.util.List;

public interface ClientRepository extends BaseRepository<Client, Long> {

        List<Client> findAll();

}
