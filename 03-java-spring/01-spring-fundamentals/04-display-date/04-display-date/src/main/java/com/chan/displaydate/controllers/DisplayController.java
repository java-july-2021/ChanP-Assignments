package com.chan.displaydate.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DisplayController {
	private Date getDate() {
		Date current = new Date();
		return current;
	}
	
	@RequestMapping("/")
	private String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	private String date(Model viewModel) {
		viewModel.addAttribute("datetime", getDate());
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	private String time(Model viewModel) {
		viewModel.addAttribute("datetime", getDate());
		return "time.jsp";
	}
}
