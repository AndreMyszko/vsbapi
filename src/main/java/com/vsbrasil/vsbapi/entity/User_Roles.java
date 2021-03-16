package com.vsbrasil.vsbapi.entity;

import javax.persistence.*;

//POJO
@Entity
@Table(name = "user_role_tbl")
public class User_Roles {
    //ATRIBUTES:
    @Id //PK *primarykey
    @GeneratedValue//INCREMENT - incrementa, mas com outra configuração
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    // @ManyToOne(cascade = CascadeType.ALL) //FK - foregnin key (many to one)
    // @JoinColumn(name = "user")
    // private User user;


    //CONSTRUCTORS:
    //empty constructor
    public User_Roles() {
    }

    //all fields constructor:
    public User_Roles(Integer id, String name/*, User user*/) {
        this.id = id;
        this.name = name;
        //this.user = user;
    }

    //no ID constructor:
    public User_Roles(String name/*, User user*/) {
        this.name = name;
        //this.user = user;
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

    // public User getUser(){
    //     return user;
    // }

    // public void setUser(User user){
    //     this.user = user;
    // }

    //TO STRING:
    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            //", name='" + getName() + "'" +
            "}";
    }


}
