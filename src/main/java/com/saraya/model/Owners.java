package com.saraya.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Owners {
	private int id;
	private String firstName;
	private String lastName;
	private String address; 
	private String city;
	private int telephone;
	private List<Pets> pet;
	public Owners() {
		super();
	}
	public Owners(int id, String firstName, String lastName, String address, String city, int telephone,
			List<Pets> pet) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.telephone = telephone;
		this.pet = pet;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	public List<Pets> getPet() {
		return pet;
	}
	public void setPet(List<Pets> pet) {
		this.pet = pet;
	}
	@Override
	public String toString() {
		return "Owners [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ ", city=" + city + ", telephone=" + telephone + ", pet=" + pet + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, city, firstName, id, lastName, pet, telephone);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Owners other = (Owners) obj;
		return Objects.equals(address, other.address) && Objects.equals(city, other.city)
				&& Objects.equals(firstName, other.firstName) && id == other.id
				&& Objects.equals(lastName, other.lastName) && Objects.equals(pet, other.pet)
				&& telephone == other.telephone;
	}
	
	
public void addPet(Pets pets) {
	this.pet.add(pets);
	
}
	
	
	
}