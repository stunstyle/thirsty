package com.fmi.Thirsty.security;

import com.fmi.Thirsty.model.User;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

@Component
public class UserSecurity {
    public boolean hasUserAuthority(Authentication authentication, String username) {
        try {
            User userDetails = (User) authentication.getPrincipal();
            return userDetails.getUsername().equals(username);
        } catch (ClassCastException e) {
            return false;
        }
    }
}
