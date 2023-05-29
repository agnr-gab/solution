package br.com.viaHub.Comando.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableFeignClients
public class ComandoApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(ComandoApplication.class, args);


    }

}
