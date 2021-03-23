package com.vsbrasil.vsbapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api")
public class HomeController {
    // default page (no user logged in)
    @GetMapping("/home")
    public String title() {
        return ("Virtual Solution");
    }

}
