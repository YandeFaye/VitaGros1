package com.saraya.model;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Pets {
	private int id; 
	private String name; 
	private LocalDate dateOfBirth;
	private PetType petType; 
	private Visits visits;
	private int ownerid;
	
	public Pets() {
		super();
	}

	public Pets(int id, String name, LocalDate dateOfBirth, PetType petType,  Visits visits, int ownerid) {
		super();
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.petType = petType;
		this.visits = visits;
		this.ownerid = ownerid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public PetType getPetType() {
		return petType;
	}

	public void setPetType(PetType petType) {
		this.petType = petType;
	}

	public  Visits getVisits() {
		return visits;
	}

	public void setVisits(Visits visits) {
		this.visits = visits;
	}

	public int getOwnerid() {
		return ownerid;
	}

	public void setOwnerid(int ownerid) {
		this.ownerid = ownerid;
	}

	@Override
	public String toString() {
		return "Pets [id=" + id + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", petType=" + petType
				+ ", visits=" + visits + ", ownerid=" + ownerid + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dateOfBirth, id, name, ownerid, petType, visits);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pets other = (Pets) obj;
		return Objects.equals(dateOfBirth, other.dateOfBirth) && id == other.id && Objects.equals(name, other.name)
				&& ownerid == other.ownerid && Objects.equals(petType, other.petType)
				&& Objects.equals(visits, other.visits);
	}
	

	
	
}
		
	
	
	
	

