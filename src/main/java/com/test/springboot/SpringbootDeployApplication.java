package com.test.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
@RestController
public class SpringbootDeployApplication {
 Logger logger = LoggerFactory.getLogger(SpringbootDeployApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringbootDeployApplication.class, args);
	}
   
	@GetMapping("/message")
	public String message() {
		logger.info("*****Insdie Message method*****");
		return "Hi deployed successfully";
	}
}
