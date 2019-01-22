package com.example.springcloud.client.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {
    @RequestMapping("/test")
    public String test(){

        return "1";
    }
}
