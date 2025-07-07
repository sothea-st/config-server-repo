package com.micro.customer.controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Value("${customer.service.greeting}")
    private String greeting;

    @GetMapping("/hello")
    public String sayHello() {
        return greeting;
    }
}
