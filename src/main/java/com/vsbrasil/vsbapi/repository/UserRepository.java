package com.vsbrasil.vsbapi.repository;

import com.vsbrasil.vsbapi.entity.User;
import org.springframework.data.repository.CrudRepository;

//Conexão JPA: entity/database
public interface UserRepository extends CrudRepository<User, Integer> {
    User findByName(String name);
}