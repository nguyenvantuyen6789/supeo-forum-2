package com.tuyennguyen.web;

import com.tuyennguyen.domain.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }

    @GetMapping("s")
    public String show() {
        Product product = new Product(1, "abc");
        System.out.println(product);
        return "Data 33";
    }

}
