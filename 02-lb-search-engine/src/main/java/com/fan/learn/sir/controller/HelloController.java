package com.fan.learn.sir.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class HelloController {

    @GetMapping("hello/{name}")
    public String hello(@PathVariable("name") String name) {
        return "hello, lb-search-engine: " + Optional.ofNullable(name).orElse("N/A") + "\r\n";
    }
}
