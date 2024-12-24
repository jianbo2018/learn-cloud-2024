package com.fan.learn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class HelloController {
    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable String name) {
        return "hello " + Optional.ofNullable(name).orElse("N/A");
    }
}
