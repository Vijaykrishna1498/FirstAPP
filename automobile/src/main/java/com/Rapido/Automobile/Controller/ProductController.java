package com.Rapido.Automobile.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Rapido.Automobile.Service.ProductsService;
import com.Rapido.Automobile.model.Product;



@RestController
	@RequestMapping("/api/v1/products")
	public class ProductController {

	    @Autowired
	    private ProductsService service;

		
		  @PostMapping public Product addProduct(@RequestBody Product product) {
			  
		 System.out.println("Add Product : ");
		 return service.saveProduct(product); }
		 

	    @GetMapping
	    public List<Product> findAllProducts() {
	        return service.getAllProducts();
	    }
		/*
		 * @GetMapping("{id}") public Product findProductById(@PathVariable int id) {
		 * return service.getProductById(id); }
		 * 
		 * @PutMapping public Product updateProduct(@RequestBody Product product) {
		 * return service.updateProduct(product); }
		 * 
		 * @DeleteMapping("{id}") public String deleteProduct(@PathVariable int id) {
		 * return service.deleteProduct(id); }
		 */

}
