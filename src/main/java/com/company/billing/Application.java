package com.company.billing;

import com.company.billing.model.Client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

//@Configuration
//@ComponentScan("com.company.billing")
public class Application {
    public static void main(String[] args) {

        // ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        ApplicationContext context = new AnnotationConfigApplicationContext(AppContext.class);

        Client client = context.getBean(Client.class);
        System.out.println(client.getFirstName());
        System.out.println(Arrays.toString(context.getBeanDefinitionNames()));

        // ClientRepository clientRepository = (ClientRepository)context.getBean("clientRepository");
        // System.out.println(clientRepository.findAll());

    }

}
