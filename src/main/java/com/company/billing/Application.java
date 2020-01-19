package com.company.billing;

import com.company.billing.model.Client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Arrays;

//@EnableJpaRepositories
public class Application {
    public static void main(String[] args) {
       // ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

//        HelloWorld obj = (HelloWorld) context.getBean("helloBean");
//        obj.printHello();

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
        Client client = (Client)ctx.getBean(Client.class);
        System.out.println(client.getFirstName());

       //System.out.println(Arrays.toString(context.getBeanDefinitionNames()));

      // ClientRepository clientRepository = (ClientRepository)context.getBean("clientRepository");
      // System.out.println(clientRepository.findAll());

    }

}
