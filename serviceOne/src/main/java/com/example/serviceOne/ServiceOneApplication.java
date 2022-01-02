package com.example.serviceOne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ServiceOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceOneApplication.class, args);
	}

}

@RestController//("/one")
@RequestMapping("/nt-ms1")
class HelloController {

	@GetMapping("/hi")
	public String HiOne(){
		return "Hi from One";
	}
}
