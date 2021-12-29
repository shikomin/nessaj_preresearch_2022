package com.nessaj.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class MainController {

    @GetMapping("/hello")
    public ResponseEntity<?> queryByAnswerId(String name) {
        return new ResponseEntity<String>("Hi " + name + ", welcome back!", HttpStatus.OK);
    }

}
