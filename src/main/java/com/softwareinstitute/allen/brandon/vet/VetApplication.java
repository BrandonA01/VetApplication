package com.softwareinstitute.allen.brandon.vet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;

@SpringBootApplication
@RestController
public class VetApplication {

	static AnimalRepository animalList = new AnimalRepository();
	static String zooURL = "http://localhost:1235";

	public static void main(String[] args) {
		animalList.add();
		SpringApplication.run(VetApplication.class, args);
		getAllAnimals();
	}

	@GetMapping("/customRoute")
	public static @ResponseBody String getAllAnimals() {
		zooURL += "/allAnimals";
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = null;
		try{
			response=restTemplate.exchange(zooURL, HttpMethod.GET, getHeaders(), String.class);
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println(response.getBody());
		return response.getBody().toString();
	}

	private static HttpEntity<?> getHeaders() {
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		return new HttpEntity<>(headers);
	}

	@GetMapping("/test")
	public @ResponseBody String testHttpResponse() {
		return "New Test";
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