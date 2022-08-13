package com.softwareinstitute.allen.brandon.vet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class VetApplication {



	public static void main(String[] args) {
		SpringApplication.run(VetApplication.class, args);
	}

	@PutMapping("/addNewAnimal")
	@ResponseBody
	public String add(@RequestParam String name, @RequestParam String colour, @RequestParam int age, @RequestParam boolean alive) {
		connectionToZooAnimals("/add", HttpMethod.PUT, "/"+name+"/"+colour+"/"+age+"/"+alive);
		return connectionToZooAnimals("/search", HttpMethod.GET, "/"+name);
	}

	@GetMapping("/customRoute")
	public String getAllAnimals(){
		return connectionToZooAnimals("/allAnimals", HttpMethod.GET);
	}

	public String connectionToZooAnimals(String str, HttpMethod var, String body) {
		String zooURL = "http://localhost:1235" + str + body;
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = null;
		try{
			response=restTemplate.exchange(zooURL, var, getHeaders(), String.class);
			return response.getBody().toString();

		}
		catch(Exception e){
			return e.getMessage();
		}
	}

	public @ResponseBody String connectionToZooAnimals(String str, HttpMethod var) {
		return connectionToZooAnimals(str, var, "");
	}


	private static HttpEntity<?> getHeaders() {
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		return new HttpEntity<>(headers);
	}
}