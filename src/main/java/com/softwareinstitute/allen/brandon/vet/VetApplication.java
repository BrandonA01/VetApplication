package com.softwareinstitute.allen.brandon.vet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class VetApplication {

	static AnimalRepository animalList = new AnimalRepository();

	public static void main(String[] args) {
		animalList.add();
		SpringApplication.run(VetApplication.class, args);
	}

	@GetMapping("/customRoute")
	public @ResponseBody String getAllAnimals() {
		return animalList.toStringJSON(animalList.getAll());
	}

	@GetMapping("/search")
	public @ResponseBody String getAnimalName(@RequestParam String name) {
		return animalList.toStringJSON(animalList.searchAnimalByName(name));
	}

	@PutMapping("/add")
	@ResponseBody
	public void add(@RequestParam String name, @RequestParam String colour, @RequestParam int age, @RequestParam boolean alive) {
		animalList.addAnimal(new Cat(alive, age, name, colour));
	}
}