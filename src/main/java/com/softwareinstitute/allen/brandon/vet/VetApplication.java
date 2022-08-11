package com.softwareinstitute.allen.brandon.vet;

import com.google.gson.Gson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class VetApplication {

	private static AnimalRepository repository = new AnimalRepository();

	public static void main(String[] args) {
		SpringApplication.run(VetApplication.class, args);
	}

	@GetMapping("/customRoute")
	public @ResponseBody String getAllAnimals() {
		repository.add();
		String json = new Gson().toJson(repository.getAll());
		return json;
	}
}//
