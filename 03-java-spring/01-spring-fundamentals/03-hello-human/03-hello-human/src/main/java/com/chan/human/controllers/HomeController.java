package com.chan.human.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {
		
	@RequestMapping("/")
	private String index(@RequestParam(value="name", required=false, defaultValue="Human") String name, Model viewModel) {
		viewModel.addAttribute("name", name);
		return "index.jsp";
	}
		
	@RequestMapping("/{name}")
	private String human(@PathVariable("name") String name, Model viewModel) {
		viewModel.addAttribute("name", name);
		return "name.jsp";
	}
}

