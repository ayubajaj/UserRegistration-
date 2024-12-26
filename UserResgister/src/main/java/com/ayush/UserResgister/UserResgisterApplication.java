package com.ayush.UserResgister;

import com.ayush.UserResgister.model.User;
import com.ayush.UserResgister.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class UserResgisterApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(UserResgisterApplication.class, args);

		User user= context.getBean(User.class);
		user.setEmail("ayubajaj07@gmail.com");
		user.setPassword("Abcdecf@01");
		UserService service=context.getBean(UserService.class);
		service.addUser(user);
		List<User> allUsers=service.allUsers();
		System.out.println(allUsers);
	}

}
