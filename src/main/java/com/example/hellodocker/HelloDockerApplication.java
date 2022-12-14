package com.example.hellodocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloDockerApplication {

    @GetMapping("/message")
    public String getMessage(){
        return "Hello World From Nipun Liyanage";
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloDockerApplication.class, args);
    }

}
