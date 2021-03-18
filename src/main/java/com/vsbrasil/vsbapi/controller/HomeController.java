package com.vsbrasil.vsbapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.List;
import java.util.Optional;

import com.vsbrasil.vsbapi.entity.User;
import com.vsbrasil.vsbapi.repository.UserRepository;

@RestController()
@RequestMapping("/api")
@Api(value = "HOME / USER CONTROLLER")
@CrossOrigin() //origins = "*"
public class HomeController {

    // instantiate user repository
    @Autowired
    private UserRepository userRepository;

    // not logged user
    @GetMapping("/home")
    public String title() {
        return ("Virtual Solution");
    }

    // find all users
    @GetMapping("/all-users")
    @ApiOperation(value = "SHOW ALL USERS")
    public List<User> listUsers() {
        return userRepository.findAll();
    }

    // find user by id
    @GetMapping("/user-id={id}")
    @ApiOperation(value = "SHOW USER BY ID")
    public Optional<User> selectById(@PathVariable(value = "id") Integer id) {
        return userRepository.findById(id);
    }

    // find user by name
    @GetMapping("/user-name={name}")
    @ApiOperation(value = "SHOW USERS BY NAME")
    public List<User> selectByName(@PathVariable(value = "name") String name) {
        return userRepository.findByName(name);
    }

    // insert new user
    @PostMapping("/insert-user")
    @ApiOperation(value = "INSERT NEW USER")
    public User savetUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    // delete user (VOID)
    @DeleteMapping("/delete-user")
    @ApiOperation(value = "DELETE USER")
    public void deleteUser(@RequestBody User user){
        userRepository.delete(user);
    }

    // update user 
    @PutMapping("/update-user")
    @ApiOperation(value = "UPDATE USER")
    public User updateUser(@RequestBody User user){
        return userRepository.save(user);
    }

    // AUTHENTICATION AND AUTHORIZATION:

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
