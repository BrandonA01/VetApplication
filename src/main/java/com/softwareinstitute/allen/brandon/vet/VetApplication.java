package com.softwareinstitute.allen.brandon.vet;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class VetApplication {


	public static void main(String[] args) {
		SpringApplication.run(VetApplication.class, args);
	}

	@GetMapping(path="/customRoute")
	public @ResponseBody String getAllAnimals() throws JsonProcessingException {
		AnimalRepository animalList = new AnimalRepository();
		animalList.add();
		return animalList.toStringJSON(animalList);
	}
}