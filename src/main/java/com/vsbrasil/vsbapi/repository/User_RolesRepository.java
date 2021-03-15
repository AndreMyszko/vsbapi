package com.vsbrasil.vsbapi.repository;

import com.vsbrasil.vsbapi.entity.User_Roles;
import org.springframework.data.repository.CrudRepository;

//Conexão JPA: entity/database
public interface User_RolesRepository extends CrudRepository<User_Roles, Integer> {
    User_Roles findByName(String name);
}
