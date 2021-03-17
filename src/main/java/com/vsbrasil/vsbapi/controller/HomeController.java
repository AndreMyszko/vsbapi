package com.vsbrasil.vsbapi.controller;

//import java.util.List;

//import com.vsbrasil.vsbapi.entity.User;
import com.vsbrasil.vsbapi.service.MyUserDetailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/api")
public class HomeController {
    @Autowired
    private MyUserDetailService myUserDetailService;

    //not logged user
    @GetMapping("/home")
    public String home() {
        return ("<h1>Welcome</h1><p style='background-color:red;'>This page do not need any autorization to be accessed<p>");
    }

    //logged normal user
    @PostMapping("/user")
    public String user() {

        return myUserDetailService.toString();
    }

    //logged admin user
    @PostMapping("/admin")
    public String admin() {
        return myUserDetailService.toString();
    }
    
}
