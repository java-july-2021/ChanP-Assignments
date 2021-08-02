package com.chan.language.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.chan.language.models.Language;
import com.chan.language.services.LanguageService;

@Controller
public class LanguageController {
	private final LanguageService langService;
	public LanguageController(LanguageService service) {
		this.langService = service;
	}
	
	@GetMapping("/")
	public String languages(Model model, @ModelAttribute("language") Language language) {
		model.addAttribute("allLanguages", this.langService.allLanguages());
		return "languages.jsp";
	}
}
