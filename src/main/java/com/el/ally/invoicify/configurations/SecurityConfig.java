package com.el.ally.invoicify.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.el.ally.invoicify.services.AppUserDetailsService;



@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private AppUserDetailsService userDetailsService;

    public SecurityConfig(AppUserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    //allow POST routes to /api/user and /api/session endpoints
    //require authorization for everything else
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
        .antMatchers(HttpMethod.PUT, "/api/session").permitAll()

    	.antMatchers(HttpMethod.POST, "/api/user").permitAll()    

    	.antMatchers(HttpMethod.OPTIONS).permitAll()

    	.antMatchers("/v2/api-docs", "/configuration/ui", "/swagger-resources", "/configuration/security", "/swagger-ui.html", "/webjars/**").permitAll()

//    	.anyRequest().authenticated()

    	.and()

    	.csrf().disable();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    public UserDetailsService userDetailsService() {
        return userDetailsService;
    }

}