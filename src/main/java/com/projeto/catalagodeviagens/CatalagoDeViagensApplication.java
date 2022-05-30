package com.projeto.catalagodeviagens;

import com.projeto.catalagodeviagens.services.S3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CatalagoDeViagensApplication implements CommandLineRunner {


    public static void main(String[] args) {
        SpringApplication.run(CatalagoDeViagensApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    }
}
