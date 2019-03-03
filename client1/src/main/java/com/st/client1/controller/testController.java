package com.st.client1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
    @Value("${server.port}")
    String port;
    @RequestMapping(value = "/hi")
    public String test(@RequestParam String name){
        return "hello "+name+" ! i am from "+port;
    }
}
