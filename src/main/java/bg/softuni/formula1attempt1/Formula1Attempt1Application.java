package bg.softuni.formula1attempt1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class Formula1Attempt1Application {

	public static void main(String[] args) {
		SpringApplication.run(Formula1Attempt1Application.class, args);
	}

}
