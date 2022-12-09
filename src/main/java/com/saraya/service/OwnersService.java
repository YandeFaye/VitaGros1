package com.saraya.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saraya.model.Owners;
import com.saraya.model.Pets;


@Service
public class OwnersService {
	private static List<Owners> owner = new ArrayList<Owners>();
	PetsService service = new PetsService();
	private static int count = 10;
	 
	
	

	static {
		owner.add(new Owners(1, "George", "Franklin", "110 W.Liberty St", "Madison", 608551023, new ArrayList<Pets>()));
		owner.add(new Owners(2, "Betty", "Davis", "638 Cardinal Ave", "Sun Prairie", 608551749, new ArrayList<Pets>()));
		owner.add(new Owners(3, "Eduardo", "Rodriquez", "2693 Commerce St", "McFarland", 608558763, new ArrayList<Pets>()));
		owner.add(new Owners(4, "Harold", "Davis", "563 Friendy St", "Windsor", 608553198, new ArrayList<Pets>()));
		owner.add(new Owners(5, "Peter", "McTavish", "2387 S.Fair Way", "Madison", 608552765, new ArrayList<Pets>()));
		owner.add(new Owners(6, "Jean", "Coleman", "105 N.Lake St", "Monona", 608552654, new ArrayList<Pets>()));
		owner.add(new Owners(7, "Jeff", "Black", "1450 Oak Blvd", "Monona", 608555387, new ArrayList<Pets>()));
		owner.add(new Owners(8, "Maria", "Escobito", "345 Maple St", "Madison", 608557683, new ArrayList<Pets>()));
		owner.add(new Owners(9, "David", "Schroeder", "2749 Blackhawk Trail", "Madison", 608559435,new ArrayList<Pets>()));
		owner.add(new Owners(10, "Carlos", "Estaban", "2335 Independence La", "Waunakee",608555487,new ArrayList<Pets>()));

	}

	public List<Owners> retrieveAllOwner() {
		return owner;
	}

	public void addOwner(String firstName, String lastName, String address, String city, int telephone,
			List<Pets> pet) {
		owner.add(new Owners(++count, firstName, lastName, address, city, telephone,pet));
	}

	public void updateOwners(Owners owners) {
		owner.remove(owners);
		owner.add(owners);
	}

	public void deleteOwner(int id) {
		Iterator<Owners> iterate = owner.iterator();
		while (iterate.hasNext()) {
			Owners owners = iterate.next();
			if (owners.getId() == id) {
				iterate.remove();
			}
		}
	}

	public Owners viewOwner(int id) {
		Iterator<Owners> iterate = owner.iterator();
		while (iterate.hasNext()) {
			Owners owners = iterate.next();
			if (owners.getId() == id) {
				return owners;
			}
		}
		return null;
	}
	public void addPet(int petId,int ownerId) {
		
		Owners owner = viewOwner(ownerId);
		Pets pet = service.viewPets(petId);
		owner.addPet(pet);
		
	}
	public Owners getOwner(int id) {
		for (Owners owner :owner ) {
			if(owner.getId() == id) {
				return owner;
			}
		}
		return null;
	}
	
	//  Search
	public Owners findOwner(String name){
	    for (Owners o: owner) {
	      String searchName = o.getFirstName() + o.getLastName();
	      if (o.getFirstName().equalsIgnoreCase(name) || o.getLastName().equalsIgnoreCase(name) || searchName.equalsIgnoreCase(name)){
	        return o;
	      }
	    }
	    return null;
	  }
}
