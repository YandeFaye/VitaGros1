package com.saraya.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.saraya.model.Pets;
import com.saraya.model.Specialty;
import com.saraya.model.Vets;

@Service
public class VetsService {
	public static List<Vets> vets=new ArrayList();
	
	static {
		vets.add(new Vets(1,"James Carte","none",new Specialty("vetenaire")));
		vets.add(new Vets(2,"Linda Douglas","dentistry surgery",new Specialty("vetenaire")));
		vets.add(new Vets(3,"Sharon Jenkins","none",new Specialty("vetenaire")));
		vets.add(new Vets(4,"Helen Leary","radiology",new Specialty("vetenaire")));
		vets.add(new Vets(5,"Rafael Ortega","Surgery",new Specialty("vetenaire")));
		vets.add(new Vets(6,"Henry Stevens","radiology",new Specialty("vetenaire")));
		
	}
	public List<Vets> retrieveAllVets() {
		return vets;
	}
	

}
