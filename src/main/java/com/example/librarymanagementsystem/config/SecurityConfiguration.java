package com.example.librarymanagementsystem.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration{
	
	@Bean
	protected SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.requestMatchers("/edit/**").hasAnyRole(UserRole.ADMIN.name(),UserRole.PUBLISHER.name())
			.requestMatchers("/delete/**").hasRole(UserRole.ADMIN.name())
			.requestMatchers("/actuator/**").hasRole(UserRole.ADMIN.name())
			.anyRequest().authenticated()
			.and()
			.formLogin();
	
		return http.build();
	}
	
	@Bean
	protected UserDetailsService userDetailsService(AuthenticationManagerBuilder auth) throws Exception {
		UserDetails user_admin = User.builder()
				.username("user_admin")
				.password("{noop}1234")
				.roles(UserRole.ADMIN.name()).build();
		
		UserDetails user_publisher = User.builder()
				.username("user_publisher")
				.password("{noop}123")
				.roles(UserRole.PUBLISHER.name()).build();
		
		UserDetails user_read_only = User.builder()
				.username("user_read_only")
				.password("noop}12")
				.roles(UserRole.READ_ONLY.name()).build();
		
		return new InMemoryUserDetailsManager(user_admin,user_publisher,user_read_only);
	}
	
}
