package com.artarkatesoft.buildingspringbootwebappsection2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class BuildingSpringBootWebAppSection2Application {

    public static void main(String[] args) {
        SpringApplication.run(BuildingSpringBootWebAppSection2Application.class, args);
    }

}
