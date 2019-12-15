package com.fmi.Thirsty.model;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class User implements UserDetails {

    @Indexed(unique=true, sparse=true)
    private String username;

    private String password;

    private String email;

    private List<String> savedCocktail;

    public User(String username, String password, String email, List<String> savedCocktail)
    {
        this.username = username;
        this.password = password;
        this.email = email;
        this.savedCocktail = savedCocktail;
    }

    public User() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
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
        return true;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singletonList(new SimpleGrantedAuthority("USER"));
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getSavedCocktail()
    {
        return savedCocktail;
    }

    public void setSavedCocktail(List<String> savedCocktail)
    {
        this.savedCocktail = savedCocktail;
    }
}
