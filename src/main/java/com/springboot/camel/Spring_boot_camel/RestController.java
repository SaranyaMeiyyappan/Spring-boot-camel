package com.springboot.camel.Spring_boot_camel;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController{

    @GetMapping("/hello")
    public String getDetails(){
        return "hi";
    }

    @GetMapping("/hi")
    public String getRoute(){
        return "I redirected from camel routes";
    }
}
