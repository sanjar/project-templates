package com.template.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.template.model.Animal;

@RestController
public class AnimalController {
	
	
	
	@GetMapping("/animals")
    public ResponseEntity<List<Animal>> getPetAnimals() {
		Animal animal1 = new Animal();
		animal1.setAnimalId(1);
		animal1.setSpecies("Carni");
		Animal animal2 = new Animal();
		animal2.setAnimalId(2);
		animal2.setSpecies("Herbi");
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(animal1);
		animals.add(animal2);
        return new ResponseEntity<List<Animal>>(animals,HttpStatus.OK);
    }
	
	

}
