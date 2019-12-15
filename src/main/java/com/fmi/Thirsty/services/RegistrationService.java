package com.fmi.Thirsty.services;

import com.fmi.Thirsty.model.User;
import com.fmi.Thirsty.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService
{
    @Autowired
    UserRepository userRepository;

    public void register(User user)
    {
        userRepository.save(user);
    }

}
