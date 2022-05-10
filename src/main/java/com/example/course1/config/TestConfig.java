package com.example.course1.config;

import com.example.course1.entities.User;
import com.example.course1.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "jairin", "jairin@gmail.com", "99912939", "1234124");
        User u2 = new User(null, "cleitin", "cleitin@gmail.com", "9129", "1234124");
        userRepository.saveAll(Arrays.asList(u1, u2));

    }
}
