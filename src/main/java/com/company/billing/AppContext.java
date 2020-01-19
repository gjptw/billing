package com.company.billing;

import com.company.billing.model.Client;
import com.company.billing.model.ClientData;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration
//@ComponentScan("com.company.billing.model")
public class AppContext {
    @Bean
    public Client client() {
        Client client = new Client();
        //client.set(clientData());
        return client;
    }

    @Bean
    public ClientData clientData() {
        ClientData clientData = new ClientData();
       // clientData.set();
        return clientData;
    }
}
