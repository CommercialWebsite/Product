package com.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@SpringBootApplication
@EnableAutoConfiguration
public class PachimariApplication {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World! Product";
    }

	public static void main(String[] args) {
		SpringApplication.run(PachimariApplication.class, args);
		// Test
	}

}
