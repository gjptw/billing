package com.company.billing.jpa;

import com.company.billing.model.Client;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("clientRepository")
public interface ClientRepository extends BaseRepository<Client, Long> {

        List<Client> findAll();

}
