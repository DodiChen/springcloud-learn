package com.dodichen.firstserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FirstServerApplication {

    public static void main(String[] args) {
        //SpringApplication.run(FirstServerApplication.class, args);
        new SpringApplicationBuilder(FirstServerApplication.class).web(true).run(args);
    }
}
