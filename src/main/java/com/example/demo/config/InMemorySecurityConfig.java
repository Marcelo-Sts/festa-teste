package com.example.demo.config;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication
.builders.AuthenticationManagerBuilder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class InMemorySecurityConfig {
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder builder)
	throws Exception {
		 
		builder.inMemoryAuthentication()
	.withUser("marcelo").password("{noop}123").roles("USER")
	.and()
	.withUser("maria").password("123").roles("USER")
	.and()
	.withUser("jose").password("123").roles("USER");
	}
	}


