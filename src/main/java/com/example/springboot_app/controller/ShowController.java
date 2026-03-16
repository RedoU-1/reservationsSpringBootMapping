/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.example.springboot_app.controller;

import com.example.springboot_app.model.Show;
import com.example.springboot_app.model.ShowService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 */
@Controller
public class ShowController {
	@Autowired
	ShowService service;

	@GetMapping("/shows")
    	public String index(Model model) {
		List<Show> shows = service.getAll();

		model.addAttribute("shows", shows);
		model.addAttribute("title", "Liste des spectacles");
		
        	return "show/index";
    	}
	
	@GetMapping("/shows/{id}")
   	 public String show(Model model, @PathVariable("id") String id) {
		Show show = service.get(id);

		model.addAttribute("show", show);
		model.addAttribute("title", "Fiche d'un spectacle");
		
        	return "show/show";
    	}

}

