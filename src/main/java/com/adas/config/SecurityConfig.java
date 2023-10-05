package com.adas.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import lombok.RequiredArgsConstructor;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
		return http
				.csrf(csrf -> 
						csrf
						.disable())
				.authorizeHttpRequests(authRequest -> 
					authRequest
						.antMatchers("").permitAll()
						.antMatchers("/admin/**").authenticated()
//						.antMatchers("/css/**", "/js/**", "/img/**", "/doc/**").permitAll()
//						.anyRequest().permitAll()
						)
				.formLogin(withDefaults())
				.build();
	}
}
