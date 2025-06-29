package com.Rapido.Automobile.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Rapido.Automobile.Repository.Productrepositary;
import com.Rapido.Automobile.model.Product;
@Service
public class ProductsService {
	@Autowired
	private Productrepositary repository;

	public List<Product> getAllProducts() {
		return repository.getAllProducts();
	}

}
