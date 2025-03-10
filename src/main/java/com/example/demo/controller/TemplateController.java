package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class TemplateController {

    @GetMapping
    public ResponseEntity<String> getHelloWorld(){
        return ResponseEntity.ok("Hello World");
    }

}
