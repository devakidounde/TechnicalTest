package com.example.demo.service;

import com.example.demo.entity.Product;

public interface ProductServiceI 
{
	public Product addProduct(Product pdt);
	
	public Product getProductById(Integer id);
	
	
	public void deleteProductById(Integer id);

	void editProductById(Product pdt, int id);
	
	
	
}
