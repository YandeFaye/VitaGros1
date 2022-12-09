package com.saraya.model;

import java.time.LocalDate;
import java.util.Objects;

public class Visits {
	int id;
	private LocalDate date;
	private String description;
	
	
	public Visits() {
		super();
	}

	public Visits(int id, LocalDate date, String description) {
		super();
		this.id = id;
		this.date = date;
		this.description = description;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	

	@Override
	public String toString() {
		return "Visits [id=" + id + ", date=" + date + ", description=" + description + ", idPet=" + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, description, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Visits other = (Visits) obj;
		return Objects.equals(date, other.date) && Objects.equals(description, other.description) && id == other.id;
	}
	
}