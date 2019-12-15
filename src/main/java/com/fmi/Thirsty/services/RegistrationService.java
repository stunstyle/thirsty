package com.fmi.Thirsty.services;

import com.fmi.Thirsty.model.User;
import com.fmi.Thirsty.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService
{
    @Autowired
    UserRepository userRepository;

    public void register(User user)
    {
        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
        userRepository.save(user);
    }

}
