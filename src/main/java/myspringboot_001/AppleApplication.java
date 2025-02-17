package myspringboot_001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class AppleApplication {
	
	@RequestMapping("/demo")
	String home() {
		return "Hello,world";
	}
	
	public static void main(String[]args) {
		SpringApplication.run(AppleApplication.class, args);
	}
}
