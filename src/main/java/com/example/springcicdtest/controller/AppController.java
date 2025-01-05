package com.example.springcicdtest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/test")
    public String home(){
        return "test1";
    }

    @GetMapping("/test/cicd")
    public String cicdTest(){
        return "SUCCESS";
    }


    @GetMapping("/health")
    public String healthCheck() {
        return "healthCheck"; //
    }





}
