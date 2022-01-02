package com.example.serviceTwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ServiceTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceTwoApplication.class, args);
	}

}

@RestController
@RequestMapping("/nt-ms2")
class HiController {

	@GetMapping("/hi")
	public String getHi(){
		return "Hi from Two";
	}
}
