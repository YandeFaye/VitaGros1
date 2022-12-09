package com.saraya.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.saraya.model.Owners;
import com.saraya.model.Pets;

import com.saraya.service.PetsService;

@Controller
public class PetsController {
	@Autowired
	PetsService service1;
	
	@RequestMapping(value="/list-pet", method = RequestMethod.GET)
	public String getAllPets(ModelMap model) {
		List<Pets> pets1 =  service1.retrieveAllPets();
		model.addAttribute("pets",pets1);
		return "pet-list";
}
	@RequestMapping(value="/add-pet", method = RequestMethod.GET)
	public String addPets(ModelMap model, @RequestParam int id) {
		model.addAttribute("pets", new Pets());
		return "add-pet";
	}
	
	
	@RequestMapping(value="/add-pet", method = RequestMethod.POST)
	public String addedPets(@Valid Pets pet ,BindingResult result,@RequestParam int id) {
		if(result.hasErrors()) {
			return "add-pet";
		}
		service1.addPets(pet.getName(),pet.getDateOfBirth(),pet.getPetType() ,pet.getVisits(),id);
		return "redirect:/list-pet";
	}
	@RequestMapping(value = "/update-pet", method = RequestMethod.GET)
	public String updatePet(@RequestParam int id, ModelMap model) {
		model.addAttribute("pets",service1.getPet(id));
		return "add-pet";
	}
	
	@RequestMapping(value = "/update-pet", method = RequestMethod.POST)
	public String updatePet(@Valid Pets pets, BindingResult result) {
		if(result.hasErrors())
			return "add-pet";
	service1.updatePets(pets);
		return "redirect:/list-pet";
	}
	


}
