package com.app.eucl;

import com.app.eucl.enums.ERole;
import com.app.eucl.models.Role;
import com.app.eucl.repositories.IRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
	@Autowired
	private IRoleRepository roleRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner init() {
		return args -> {
			if(roleRepository.findByRole(ERole.ROLE_ADMIN) == null){
				Role adminRole = new Role();
				adminRole.setRole(ERole.ROLE_ADMIN);
				roleRepository.save(adminRole);
			}
			if(roleRepository.findByRole(ERole.ROLE_CUSTOMER) == null){
				Role customerRole = new Role();
				customerRole.setRole(ERole.ROLE_CUSTOMER);
				roleRepository.save(customerRole);
			}
		};
	}

}
