package com.chan.product.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chan.product.models.Category;
import com.chan.product.models.Product;
import com.chan.product.services.AppService;

@Controller
public class HomeController {
	@Autowired
	private AppService aService;
	
	@GetMapping("/products/new")
	public String newProd() {
		return "productNew.jsp";
	}
	
	@GetMapping("/categories/new")
	public String newCat( ) {
		return "categoryNew.jsp";
	}
	
	@PostMapping("/newCat")
	public String makeCat(@RequestParam("cat") String category) {
		Category newCat = new Category();
		newCat.setName(category);
		this.aService.createCategory(newCat);
		return "redirect:/categories/new";
	}
	
	@PostMapping("/newProd")
	public String makeProd(@RequestParam("name") String name, @RequestParam("description") String description, @RequestParam("price") Double price) {
		Product newProd = new Product(name, description, price);
		this.aService.createProduct(newProd);
		return "redirect:/products/new";
	}
	
	@GetMapping("/{id}")
	public String showProd(Model viewModel, @PathVariable("id") Long id) {
		Product productToShow = this.aService.getSingleProd(id);
		viewModel.addAttribute("notInProd", this.aService.findCatNotProd(productToShow));
		viewModel.addAttribute("product", productToShow);
		return "product.jsp";
	}
	
	@GetMapping("/cat/{id}")
	public String showCat(Model viewModel, @PathVariable("id") Long id) {
		Category catToShow = this.aService.getSingleCat(id);
		viewModel.addAttribute("notInCat", this.aService.findProdNotCat(catToShow));
		viewModel.addAttribute("category", catToShow);
		return "category.jsp";
	}
	
	@PostMapping("/addCatToProd/{id}")
	public String addCatToProd(@RequestParam("cats") Long id, @PathVariable("id") Long productId) {
		Product productToAddCatTo = this.aService.getSingleProd(productId);
		Category categoryToAdd = this.aService.getSingleCat(id);
		this.aService.addCategoryToProduct(productToAddCatTo, categoryToAdd);
		return "redirect:/{id}";
	}
	
	@PostMapping("/addProdToCat/{id}")
	public String addProdToCat(@RequestParam("prod") Long id, @PathVariable("id") Long categoryId) {
		Product productToAddCatTo = this.aService.getSingleProd(id);
		Category categoryToAdd = this.aService.getSingleCat(categoryId);
		this.aService.addProductToCategory(categoryToAdd, productToAddCatTo);
		return "redirect:/cat/{id}";
	}
}
