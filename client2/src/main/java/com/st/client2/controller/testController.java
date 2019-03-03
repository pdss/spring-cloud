package com.st.client2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
    @Value("${server.port}")
    String port;
    @RequestMapping("/hi")
    public String test(@RequestParam("name") String name){
        return "hello "+name+" ! i am from port:"+port;
    }
}
