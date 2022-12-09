package com.saraya.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.saraya.model.Owners;
import com.saraya.model.Visits;
import com.saraya.service.VisitsService;

@Controller
public class VisitsController {
	@Autowired
	VisitsService servicevisits;
	
	@RequestMapping(value= "/list-visit", method = RequestMethod.GET)
	public String getAllVisits(ModelMap model) {
		List<Visits>  visit1 =  servicevisits.retrieveAllVisits();
		model.addAttribute("visits",visit1);
		return "visit-list";
}
	
	@RequestMapping(value="/add-visit", method = RequestMethod.GET)
	public String addVisits(ModelMap model ) {
		model.addAttribute("visits", new Visits());
		return "add-visit";
	}
	
	
	@RequestMapping(value="/add-visit", method = RequestMethod.POST)
	public String addedVisits(@Valid Visits visit ,BindingResult result) {
		if(result.hasErrors()) {
			return "add-visit";
		}
		servicevisits.addVisits(visit.getDate(),visit.getDescription() );
		return "redirect:/list-visit";
	}

}
