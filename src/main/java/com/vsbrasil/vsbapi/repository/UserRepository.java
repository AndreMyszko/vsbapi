package com.vsbrasil.vsbapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

import com.vsbrasil.vsbapi.entity.User;

//Conexão JPA: entity/database
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByName(String name);

}