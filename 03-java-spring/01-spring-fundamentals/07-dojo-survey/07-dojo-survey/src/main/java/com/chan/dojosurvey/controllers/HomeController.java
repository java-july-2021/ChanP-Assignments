package com.chan.dojosurvey.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@RequestMapping("/")
	private String index() {
		return "index.jsp";
	}
	
	@RequestMapping(value="/result", method=RequestMethod.POST)
	private String processSurvey(@RequestParam("name") String name, @RequestParam("location") String location, @RequestParam("language") String language, @RequestParam("comment") String comment, Model viewModel) {
		viewModel.addAttribute("name", name);
		viewModel.addAttribute("location", location);
		viewModel.addAttribute("language", language);
		viewModel.addAttribute("comment", comment);
		return "result.jsp";
	}
	
}
