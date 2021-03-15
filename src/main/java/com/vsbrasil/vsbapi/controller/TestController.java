package com.vsbrasil.vsbapi.controller;

import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/api")
public class TestController {
    @GetMapping("/test")
    public String test(){
        return "TEST - TEST - TEST - TEST - TEST - TEST - TEST - TEST";
    }
}
