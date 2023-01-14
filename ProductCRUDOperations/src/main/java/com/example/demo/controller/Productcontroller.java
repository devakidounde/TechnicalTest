package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entity.Product;
import com.example.demo.entity.ProductCategory;

import com.example.demo.service.ProductServiceI;

@RestController
@RequestMapping("/product")
public class Productcontroller 
{
	@Autowired
	public ProductServiceI service;
	
	
	@PostMapping("/insert")
	public ResponseEntity<Product> insertProduct(@RequestBody Product pdt)
	{
		Product product = service.addProduct(pdt);
		return ResponseEntity.ok().body(product);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Product> getProducts(@PathVariable Integer id)
	{
		Product product = service.getProductById(id);
		return ResponseEntity.ok().body(product);
	}
	@PutMapping("/put/{id}")
	public Product updateProductById(@RequestBody Product pdt, @PathVariable int id)
	{
		service.editProductById(pdt, id);
		return pdt;
	}
	@DeleteMapping("/delete/{id}")
	public void deleteProductById(@PathVariable Integer id)
	{
		service.deleteProductById(id);
	}
	
}
