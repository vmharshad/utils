package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@ComponentScan(basePackages={"com.harshad.*"})
//@EnableWebMvc
public class Application {

	public static void main(String[] args) {
		  ApplicationContext ctx = SpringApplication.run(Application.class, args);
	}

}
