package com.vsbrasil.vsbapi.entity;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

//not Entity, only for Service...
public class User_Details implements UserDetails {

    private String name;
    private String password;
    private boolean active;
    private List<GrantedAuthority> authorities; //Autoriza baseado no "role" do "user"

    //Constructor:
    public User_Details(User user) {
        this.name = user.getName();
        this.password = user.getPassword();
        this.active = user.isActive();
        //Recebe qual o role do usuario(CSV): 
        this.authorities =  Arrays.stream(user.getUser_role().split(","))
                    .map(SimpleGrantedAuthority::new)
                    .collect(Collectors.toList());
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return name;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true; //active
    }
}