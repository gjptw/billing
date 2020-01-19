package com.company.billing;

import com.company.billing.jpa.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Arrays;

@EnableJpaRepositories
public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");

//        HelloWorld obj = (HelloWorld) context.getBean("helloBean");
//        obj.printHello();

       System.out.println(Arrays.toString(context.getBeanDefinitionNames()));

       ClientRepository clientRepository = (ClientRepository)context.getBean("clientRepository");
       System.out.println(clientRepository.findAll());
    }
}
