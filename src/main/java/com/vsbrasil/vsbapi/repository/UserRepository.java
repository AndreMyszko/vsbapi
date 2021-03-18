package com.vsbrasil.vsbapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

import com.vsbrasil.vsbapi.entity.User;

//Conexão JPA: entity/database
public interface UserRepository extends JpaRepository<User, Integer> {
    //FIND ALL USERS:
    //JpaRepository procedure.

    //FIND USER BY ID:
    Optional<User> findById(Integer id);

    //FIND USER BY NAME:
    List<User> findByName(String name);


}