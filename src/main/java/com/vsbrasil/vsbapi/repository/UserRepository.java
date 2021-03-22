package com.vsbrasil.vsbapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

import com.vsbrasil.vsbapi.entity.User;

//Conexão JPA: entity/database
public interface UserRepository extends JpaRepository<User, Integer> {
    //FIND ALL USERS: [GET]
    //JPA - userRepository.findAll();

    //FIND USER BY ID: [GET]
    Optional<User> findById(Integer id);

    //FIND USER BY NAME: [GET]
    List<User> findByName(String name);

    Optional<User> findByEmail(String email);

    //INSERT USER: [POST]*
    //JPA - userRepository.save();

    //DELETE USER: [DELETE]
    //JPA - userRepository.delete();

    //UPDATE USER: [PUT]*
    ////JPA - userRepository.save();

}