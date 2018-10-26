package com.kbasha.demo.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class BasicConfiguration extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception
	{
		auth
			.inMemoryAuthentication()
			.withUser("basha")
				.password("{noop}dhoni")
				.roles("USER")
				.and()
			.withUser("dummy")
				.password("{noop}dummy")
				.roles("USER","ADMIN");
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
			.anyRequest()
			.authenticated()
			.and()
			.httpBasic();
	}
		
}
