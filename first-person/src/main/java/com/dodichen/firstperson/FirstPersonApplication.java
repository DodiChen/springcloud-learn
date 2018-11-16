package com.dodichen.firstperson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FirstPersonApplication {

    public static void main(String[] args) {
        //SpringApplication.run(FirstPersonApplication.class, args);
        new SpringApplicationBuilder(FirstPersonApplication.class).web(true).run(args);
    }
}
