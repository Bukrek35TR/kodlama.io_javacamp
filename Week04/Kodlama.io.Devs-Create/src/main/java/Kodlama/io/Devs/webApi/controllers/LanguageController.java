package Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.business.abstracts.LanguageServices;
import Kodlama.io.Devs.entities.concretes.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguageController {
	LanguageServices languageServices;

	@Autowired
	public LanguageController(LanguageServices languageServices) {
		this.languageServices = languageServices;
	}

	@GetMapping("/getall")
	public List<Language> getAll() {
		return languageServices.getAll();

	}
	
	@GetMapping("/getbyid")
	public Language getById(int id) throws Exception{
		return languageServices.getById(id);
		
	}
	
	@PostMapping("/add")
	public void add(Language language) throws Exception{
		languageServices.add(language);
		
	}
	
	@PutMapping("/update")
	public void update(Language language) throws Exception{
		languageServices.update(language);
		
	}
	
	@DeleteMapping("/delete")
	public void delete(Language language) throws Exception{
		languageServices.delete(language);
		
	}

}
