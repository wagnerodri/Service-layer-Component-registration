package com.projeto1.projeto1.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.projeto1.projeto1.entities.User;
import com.projeto1.projeto1.repositories.UserRepository;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "noah", "noah@gmail.com", "1232123", "147852"); // Correção no e-mail
        User u2 = new User(null, "eliane", "eliane@gmail.com", "369852147", "321654");

        // Salvar os dois usuários no banco de dados
        userRepository.saveAll(Arrays.asList(u1, u2));

    }

}
