package com.dodichen.firstpolice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FirstPoliceApplication {

    public static void main(String[] args) {

        //SpringApplication.run(FirstPoliceApplication.class, args);
        new SpringApplicationBuilder(FirstPoliceApplication.class).web(true).run(args);
    }
}
