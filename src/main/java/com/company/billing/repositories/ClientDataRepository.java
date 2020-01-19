package com.company.billing.repositories;

import com.company.billing.model.ClientData;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository("clientDataRepository")
public interface ClientDataRepository extends BaseRepository<ClientData, Long> {

        List<ClientData> findAll();

}
