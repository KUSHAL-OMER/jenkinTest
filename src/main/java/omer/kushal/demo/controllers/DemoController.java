package omer.kushal.demo.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class DemoController {
    @GetMapping("/hello")
    public String getMethodName() {
        return "Hello everyone";
    }
    
}
