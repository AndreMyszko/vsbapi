package com.vsbrasil.vsbapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

import com.vsbrasil.vsbapi.entity.User_Roles;

//Conexão JPA: entity/database
public interface User_RolesRepository extends JpaRepository<User_Roles, Integer> {
    Optional<User_Roles> findByName(String name);
}
