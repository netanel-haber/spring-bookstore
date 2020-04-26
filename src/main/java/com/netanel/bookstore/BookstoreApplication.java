package com.netanel.bookstore;

import java.sql.DriverManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.thymeleaf.extras.springsecurity5.dialect.SpringSecurityDialect;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BookstoreApplication.class, args);
		Env env = context.getBean(Env.class);

		String url = env.getUrl();
		String user = env.getUsername();
		String password = env.getPassword();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("connecting to " + url);
			DriverManager.getConnection(url, user, password);
			System.out.println("success");
		} catch (Exception exc) {
			exc.printStackTrace();
		}
	}

	@Bean
	public SpringSecurityDialect securityDialect() {
		return new SpringSecurityDialect();
	}

}
