package com.saraya.model;

import java.util.Objects;

public class PetType {
	 private String name;
	 

	
	

	public PetType() {
		super();
	}

	public PetType(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "PetType [name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PetType other = (PetType) obj;
		return Objects.equals(name, other.name);
	}
	 

}
