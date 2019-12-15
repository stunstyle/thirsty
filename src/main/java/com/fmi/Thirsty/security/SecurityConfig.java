package com.fmi.Thirsty.security;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    MyUserDetailsService myUserDetailsService;

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/error", "/login", "/logout").permitAll()
            .antMatchers("/user/{username}/**")
            .access("@userSecurity.hasUserAuthority(authentication, #username)")
            .anyRequest().authenticated().and()
            .formLogin().and().httpBasic();

        http.cors().and().csrf().disable();
    }

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(myUserDetailsService);
    }

    @Bean
    PasswordEncoder getPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    MongoTemplate getMongoTemplate() {
        MongoClientURI uri = new MongoClientURI(
            "mongodb+srv://user:user@karizma-3klyn.mongodb.net/test?retryWrites=true&w=majority");

        MongoClient mongoClient = new MongoClient(uri);

        return new MongoTemplate(mongoClient, "users");
    }
}
