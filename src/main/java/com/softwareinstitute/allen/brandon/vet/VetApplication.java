package com.softwareinstitute.allen.brandon.vet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class VetApplication {

	public static void main(String[] args) {
		SpringApplication.run(VetApplication.class, args);
	}

	@GetMapping("/customRoute")
	public @ResponseBody String getAllAnimals() {
		AnimalRepository repository = new AnimalRepository();
		repository.add();
		return repository.toString(repository);
	}
}