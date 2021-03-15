package com.vsbrasil.vsbapi.entity;

import javax.persistence.*;

//POJO
@Entity
@Table(name = "user_role_tbl")
public class User_Roles {
    //ATRIBUTES:
    @Id //PK *primarykey
    @GeneratedValue(strategy = GenerationType.AUTO) //AI - autoincrement
    @Column(name = "id")
    private Integer id;
    
    @Column(name = "name")
    private String name;

    //CONSTRUCTORS:
    //empty constructor
    public User_Roles() {
    }

    //all fields constructor:
    public User_Roles(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    //no ID constructor:
    public User_Roles(String name) {
        this.name = name;
    }

    //GETTERS AND SETTERS:
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //TO STRING:
    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            "}";
    }


}
