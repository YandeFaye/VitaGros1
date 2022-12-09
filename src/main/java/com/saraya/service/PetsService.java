package com.saraya.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saraya.model.Owners;
import com.saraya.model.PetType;
import com.saraya.model.Pets;

import com.saraya.model.Visits;

@Service
public class PetsService {

	private static List<Pets> pets = new ArrayList<Pets>();
	 public static OwnersService service1= new  OwnersService();
	 
	private static int count = 10;
	
	

	static {
		pets.add(new Pets(1, "Leo", LocalDate.of(2022, 10, 11), new PetType("cat"), new Visits(1,LocalDate.of(2022, 10, 11),"dfghjkjhgfdfgh"),1));
		pets.add(new Pets(2, "cat", LocalDate.of(2022, 10, 11), new PetType("cat"), new Visits(1,LocalDate.of(2022, 10, 11),"dfghjkjhgfdfgh"), 2));
		pets.add(new Pets(3, "dog", LocalDate.of(2022, 10, 11), new PetType("cat"), new Visits(1,LocalDate.of(2022, 10, 11),"dfghjkjhgfdfgh"), 3));
		pets.add(new Pets(4, "Hamster", LocalDate.of(2022, 10, 11), new PetType("cat"), new Visits(1,LocalDate.of(2022, 10, 11),"dfghjkjhgfdfgh"), 4));
		pets.add(new Pets(5, "perrot", LocalDate.of(2022, 10, 11), new PetType("cat"), new Visits(1,LocalDate.of(2022, 10, 11),"dfghjkjhgfdfgh"), 5));
		pets.add(new Pets(6, "cat", LocalDate.of(2022, 10, 11), new PetType("cat"), new Visits(1,LocalDate.of(2022, 10, 11),"dfghjkjhgfdfgh"), 6));
		pets.add(new Pets(7, "Goldfish", LocalDate.of(2022, 10, 11), new PetType("cat"), new Visits(1,LocalDate.of(2022, 10, 11),"dfghjkjhgfdfgh"), 7));
		pets.add(new Pets(8, "spider", LocalDate.of(2022, 10, 11), new PetType("cat"),new Visits(1,LocalDate.of(2022, 10, 11),"dfghjkjhgfdfgh"), 8));
		pets.add(new Pets(9, "Leo", LocalDate.of(2022, 10, 11), new PetType("cat"), new Visits(1,LocalDate.of(2022, 10, 11),"dfghjkjhgfdfgh"), 9));
		pets.add(new Pets(10, "cat", LocalDate.of(2022, 10, 11),new PetType("cat"), new Visits(1,LocalDate.of(2022, 10, 11),"dfghjkjhgfdfgh"), 10));
		
		service1.addPet(1, 1);
		service1.addPet(2, 2);
		service1.addPet(3, 3);
		service1.addPet(4, 4);
		service1.addPet(5, 5);
		service1.addPet(6, 6);
		service1.addPet(7, 7);
		service1.addPet(8, 8);
		service1.addPet(9, 9);
		service1.addPet(10,10);

	}

	public List<Pets> retrieveAllPets() {
		return pets;
	}

	public void addPets(String name, LocalDate dateOfBirth, PetType petType,Visits visits,int ownerid) {
		pets.add(new Pets(++count, name, dateOfBirth, petType,visits, ownerid));
		
		
	}
	public Pets getPet(int id) {
		for (Pets pet :pets) {
			if(pet.getId() == id) {
				return pet;
			}
		}
		return null;
	}

	public void updatePets(Pets pet) {
		pets.remove(pet);
		pets.add(pet);
	}
	
	

	public void deletePetsr(int id) {
		Iterator<Pets> iterate = pets.iterator();
		while (iterate.hasNext()) {
			Pets pet = iterate.next();
			if (pet.getId() == id) {
				iterate.remove();
			}
		}
	}

	public Pets viewPets(int id) {
		Iterator<Pets> iterate = pets.iterator();
		while (iterate.hasNext()) {
			Pets pet = iterate.next();
			if (pet.getId() == id) {
				return pet;
			}
		}
		return null;
	}
 
	

}
