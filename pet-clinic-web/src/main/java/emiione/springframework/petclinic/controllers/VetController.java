package emiione.springframework.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import emiione.springframework.petclinic.services.VetService;

@Controller
public class VetController {

	private final VetService vetService;

	public VetController(VetService vetService) {
		super();
		this.vetService = vetService;
	}

	@GetMapping({ "vets", "vets/index", "vets/index.html" })
	public String listVets(Model model) {

		model.addAttribute("vets", vetService.findAll());

		return "vets/index";
	}

}
