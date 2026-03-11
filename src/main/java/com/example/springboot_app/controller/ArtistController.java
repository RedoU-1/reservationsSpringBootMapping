/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.example.springboot_app.controller;

import com.example.springboot_app.model.Artist;
import com.example.springboot_app.model.ArtistService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@Controller
public class ArtistController {
	@Autowired
	ArtistService service;

   @GetMapping("/artists")
    public String index(Model model) {
	List<Artist> artists = service.getAllArtists();

	model.addAttribute("artists", artists);
	model.addAttribute("title", "Liste des artistes");
		
        return "artist/index";
    }
	
    @GetMapping("/artists/{id}")
    public String show(Model model, @PathVariable("id") String id) {
	Artist artist = service.getArtist(id);

	model.addAttribute("artist", artist);
	model.addAttribute("title", "Fiche d'un artiste");
		
        return "artist/show";
    }

}

