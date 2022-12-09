package com.saraya.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import com.saraya.model.Owners;

import com.saraya.service.OwnersService;

@Controller
public class OwnersController {
	@Autowired
	OwnersService services;
	
	@RequestMapping(value="/list-owner", method = RequestMethod.GET)
	public String getAllOwners(ModelMap model) {
		List<Owners> owners1 =  services.retrieveAllOwner();
		model.addAttribute("owners",owners1);
		return "owner-list";
}
	
	@RequestMapping(value="/add-owner", method = RequestMethod.GET)
	public String addOwners(ModelMap model ) {
		model.addAttribute("owners", new Owners());
		return "add-owner";
	}
	
	
	@RequestMapping(value="/add-owner", method = RequestMethod.POST)
	public String addedOwners(@Valid Owners owner ,BindingResult result) {
		if(result.hasErrors()) {
			return "add-owner";
		}
		services.addOwner(owner.getFirstName(),owner.getLastName(),  owner.getAddress(),  
				owner.getCity(), owner.getTelephone(),owner.getPet());
		return "redirect:/list-owner";
	}
	@RequestMapping(value="/delete-owner", method = RequestMethod.GET)
	public String deleteOwner(@RequestParam int id) {
		services.deleteOwner(id);
		return "redirect:/list-owner";
	}
	@RequestMapping(value = "/update-owner", method = RequestMethod.GET)
	public String updateOwner(@RequestParam int id, ModelMap model) {
		model.addAttribute("owners", services.getOwner(id));
		return "add-owner";
	}
	
	@RequestMapping(value = "/update-owner", method = RequestMethod.POST)
	public String updateOwner(@Valid Owners owners, BindingResult result) {
		if(result.hasErrors())
			return "add-owner";
		services.updateOwners(owners);
		return "redirect:/list-owner";
	}
	@RequestMapping(value="/owner-detail", method = RequestMethod.GET)
	public String DetailsOwner(@RequestParam int id, ModelMap model) {
		model.addAttribute("owner", services.viewOwner(id));
		return "detail-owner";
	}
	
	@RequestMapping(value = "/owner-search", method = RequestMethod.GET)
	  public String result(@RequestParam String name, ModelMap model){
	    model.addAttribute("owner", services.findOwner(name));
	    return "search-result";
	  }
 
}
