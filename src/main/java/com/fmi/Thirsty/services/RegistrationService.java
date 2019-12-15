package com.fmi.Thirsty.services;

import com.fmi.Thirsty.model.User;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

//    @Autowired
//    MongoTemplate mongoTemplate;

    public void register(User user) {
        MongoClientURI uri = new MongoClientURI(
            "mongodb+srv://user:user@karizma-3klyn.mongodb.net/test?retryWrites=true&w=majority");

        MongoClient mongoClient = new MongoClient(uri);

        MongoTemplate mongoTemplate = new MongoTemplate(mongoClient, "users");

        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
        mongoTemplate.insert(user, "user");
    }

}
