package com.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class HelloWorld {
    @GetMapping(value = "/helloworld")
    public String sayHelloWorld() {
        return "Hello World!!!";
    }

    @GetMapping(value = "/hello")
    public String sayHello(@RequestParam(name = "text") String param) {
        return param + "Hello!!!";
    }
}
