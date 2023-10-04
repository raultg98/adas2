package com.adas;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class Adas2Application implements CommandLineRunner{

//	@Autowired
//	private BCryptPasswordEncoder passEncoder;
	
	public static void main(String[] args) {
		SpringApplication.run(Adas2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}
}
