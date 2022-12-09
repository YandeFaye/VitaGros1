package com.saraya.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.saraya.model.Vets;
import com.saraya.service.VetsService;

@Controller
public class VetsController {
	@Autowired
	VetsService vetservice;
	
	@RequestMapping(value="/list-vet", method = RequestMethod.GET)
	public String getAllVets(ModelMap model) {
		List<Vets> vet1 =  vetservice.retrieveAllVets();
		model.addAttribute("vets",vet1);
		return "vet-list";
}

}
