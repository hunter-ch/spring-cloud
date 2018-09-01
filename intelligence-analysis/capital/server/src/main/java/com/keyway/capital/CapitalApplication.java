package com.keyway.capital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CapitalApplication {

    public static void main(String[] args) {
        SpringApplication.run(CapitalApplication.class, args);
    }
}
