package com.vsbrasil.vsbapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

import com.vsbrasil.vsbapi.entity.User;
import com.vsbrasil.vsbapi.repository.UserRepository;

@RestController()
@RequestMapping("/api")
public class HomeController {

    @Autowired
    private UserRepository userRepository;

    // not logged user
    @GetMapping("/home")
    public String title() {
        return ("Virtual Solution");
    }

    // user by id
    @GetMapping("/id={id}")
    public Optional<User> selectById(@PathVariable(value = "id") Integer id) {
        return userRepository.findById(id);
    }

    // user by name
    @GetMapping("/name={name}")
    public List<User> selectByName(@PathVariable(value = "name") String name) {
        return userRepository.findByName(name);
    }

    // insert new user
    @PostMapping("insert-user")
    public User savetUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    // AUTHENTICATION AND AUTHORIZATION:
    // all users
    @GetMapping("/all-users")
    public List<User> listUsers() {
        return userRepository.findAll();
    }

    // logged normal user
    @PostMapping("/user")
    public String user() {

        return ("Virtual Solution - User");
    }

    // logged admin user
    @PostMapping("/admin")
    public String admin() {
        return ("Virtual Solution - Admin");
    }

}
