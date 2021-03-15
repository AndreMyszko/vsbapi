package com.vsbrasil.vsbapi.entity;

import javax.persistence.*;

@Entity
@Table(name = "user_tbl")
public class User {
    @Id //PK - primarykey
    @GeneratedValue(strategy = GenerationType.AUTO) //AI - autoincrement
    private Integer id;
    private String name;
    // private String email;
    // private String password;
    // private String user_role;
    // private Boolean active;


    //private int age;

    
    public User() {
    }
    public User(String name /*int age*/) {
        this.name = name;
        //this.age = age;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            "}";
    }
    
}