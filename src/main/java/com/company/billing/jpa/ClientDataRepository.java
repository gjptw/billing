package com.company.billing.jpa;

import com.company.billing.model.ClientData;

import java.util.List;

public interface ClientDataRepository extends BaseRepository<ClientData, Long> {

        List<ClientData> findAll();

}
