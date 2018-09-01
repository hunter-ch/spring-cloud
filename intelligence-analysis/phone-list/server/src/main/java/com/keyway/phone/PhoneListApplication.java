package com.keyway.phone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.keyway.user.client"})
@ComponentScan(basePackages = {"com.keyway"})
public class PhoneListApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhoneListApplication.class, args);
    }
}
