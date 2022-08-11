package com.softwareinstitute.allen.brandon.vet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class VetApplicationTests {

	@Test
	void contextLoads() {
		AnimalRepository animals = new AnimalRepository();
		VetApplication app = new VetApplication();
		animals.add();
		Assertions.assertEquals(app.getAllAnimals(), "Not the same", animals.toString(animals));
	}

}
