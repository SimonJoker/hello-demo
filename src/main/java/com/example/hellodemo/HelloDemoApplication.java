package com.example.hellodemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@SpringBootApplication
public class HelloDemoApplication {


    public static void main(String[] args) {
        SpringApplication.run(HelloDemoApplication.class, args);
    }


}
