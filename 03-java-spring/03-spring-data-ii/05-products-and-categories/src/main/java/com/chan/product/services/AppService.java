package com.chan.product.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chan.product.models.Category;
import com.chan.product.models.Product;
import com.chan.product.repositories.CategoryRepository;
import com.chan.product.repositories.ProductRepository;

@Service
public class AppService {
	@Autowired
	private CategoryRepository cRepo;
	@Autowired
	private ProductRepository pRepo;
	
	public Product createProduct(Product product) {
		return this.pRepo.save(product);
	}
	
	public Category createCategory(Category category) {
		return this.cRepo.save(category);
	}
	
	public Category getSingleCat(Long id) {
		return this.cRepo.findById(id).orElse(null);
	}
	
	public Product getSingleProd(Long id) {
		return this.pRepo.findById(id).orElse(null);
	}
	
	public List<Category> findCatNotProd(Product product) {
		return this.cRepo.findByProductsNotContains(product);
	}
	
	public List<Product> findProdNotCat(Category category) {
		return this.pRepo.findByCategoriesNotContains(category);
	}
	
	public void addCategoryToProduct(Product product, Category category) {
		List<Category> existingCats = product.getCategories();
		existingCats.add(category);
		this.pRepo.save(product);
	}
	
	public void addProductToCategory(Category category, Product product) {
		List<Product> existingProds = category.getProducts();
		existingProds.add(product);
		this.cRepo.save(category);
	}
}
