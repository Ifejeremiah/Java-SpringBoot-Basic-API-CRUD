package com.example.demo.service;

import com.example.demo.entity.Department;
import com.example.demo.repository.DepartmentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(DepartmentRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new Department(1L, "IT", "Lagos", "001")));
            log.info("Preloading " + repository.save(new Department(2L, "Media", "Abuja", "002")));
        };
    }
}
