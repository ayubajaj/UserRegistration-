package com.ayush.UserResgister;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.List;

@SpringBootApplication
public class UserResgisterApplication {

	public static void main(String[] args)  {
		SpringApplication.run(UserResgisterApplication.class, args);
//		ApplicationContext context=SpringApplication.run(UserResgisterApplication.class, args);
//
//		User user= context.getBean(User.class);
//		user.setEmail("ayubajaj07@gmail.com");
//		user.setPassword("Abcdecf@01");
//		UserService service=context.getBean(UserService.class);
//		service.addUser(user);
//		List<User> allUsers=service.allUsers();
//		System.out.println(allUsers);

//		Tomcat tomcat=new Tomcat();
////		tomcat.setPort(8080);
//		Context context=tomcat.addContext("",null);
//		Tomcat.addServlet(context,"ServletRe", new ServletRe());
//		context.addServletMappingDecoded("/hello","ServletRe");
//
//		tomcat.getConnector();
//		tomcat.start();
//
//		tomcat.getServer().await();
	}

}
