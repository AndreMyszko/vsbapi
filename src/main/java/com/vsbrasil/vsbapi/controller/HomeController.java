package com.vsbrasil.vsbapi.controller;

import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/api")
public class HomeController {
    @GetMapping("/home")
    public String home(){
        return "HOME - HOME - HOME - HOME - HOME - HOME - HOME - HOME";
    }
    
}
