package com.company.billing;

import com.company.billing.model.Client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

//@EnableJpaRepositories
public class Application {
    public static void main(String[] args) {

        new SpringApplication(AppContext.class).run(args);

        // ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

//        HelloWorld obj = (HelloWorld) context.getBean("helloBean");
//        obj.printHello();

        ApplicationContext context = new AnnotationConfigApplicationContext(AppContext.class);
        Client client = context.getBean(Client.class);
        System.out.println(client.getFirstName());
        System.out.println(Arrays.toString(context.getBeanDefinitionNames()));

        // ClientRepository clientRepository = (ClientRepository)context.getBean("clientRepository");
        // System.out.println(clientRepository.findAll());

    }

}
