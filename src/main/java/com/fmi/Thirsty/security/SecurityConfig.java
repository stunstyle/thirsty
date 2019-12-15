package com.fmi.Thirsty.security;

import com.fmi.Thirsty.services.MyUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter
{

    @Autowired
    MyUserDetailsService myUserDetailsService;

    @Override
    public void configure(HttpSecurity http) throws Exception
    {
        http.authorizeRequests().antMatchers("/error", "/login", "/logout", "/register/user/**").permitAll()
                .antMatchers("/user/{username}/**")
                .access("@userSecurity.hasUserAuthority(authentication, #username)")
                .anyRequest().authenticated().and()
                .formLogin().and().httpBasic();

        http.cors().disable().csrf().disable();
    }

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception
    {
        auth.userDetailsService(myUserDetailsService);
    }

    @Bean
    PasswordEncoder getPasswordEncoder()
    {
        return new BCryptPasswordEncoder();
    }

}

@Configuration
@EnableWebMvc
class MvcConfig extends WebMvcConfigurerAdapter
{
    @Override
    public void addCorsMappings(CorsRegistry registry)
    {
        registry.addMapping("/**").allowedMethods("HEAD", "GET", "PUT", "POST", "DELETE", "PATCH");
    }
}
