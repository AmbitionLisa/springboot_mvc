package com.ls.springboot_mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com")
public class SpringbootMvcApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootMvcApplication.class, args);
    }

}
