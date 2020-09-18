package spring.boot.angular;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.boot.angular.model.User;
import spring.boot.angular.repository.UserRepository;

@SpringBootApplication
@RestController
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@RequestMapping(value = "/")
	String hello() {
		return "Hello World!";
	}

	/**
	 * 
	 * Construit un jeux de données en base de données
	 * 
	 */
	@Bean
	CommandLineRunner init(UserRepository userRepository) {
		return args -> {
			Stream.of("John", "Julie", "Jennifer", "Helen", "Rachel").forEach(name -> {
				User user = new User(name, name.toLowerCase() + "@domain.com");
				userRepository.save(user);
			});
			userRepository.findAll().forEach(System.out::println);
		};
	}
}