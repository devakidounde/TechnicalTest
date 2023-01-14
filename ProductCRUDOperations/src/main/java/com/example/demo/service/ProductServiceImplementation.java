package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.Repository.ProductCategoryRepository;
import com.example.demo.Repository.ProductRepository;

import com.example.demo.entity.Product;
import com.example.demo.entity.ProductCategory;

@Service
public class ProductServiceImplementation implements ProductServiceI
{
	@Autowired
	public ProductRepository prepo;
	
	@Autowired
	public ProductCategoryRepository pcrepo;
	
	public Product addProduct(Product pdt)
	{
		Product product = prepo.save(pdt);
		return product;
	}
	public Product getProductById(Integer id)
	{
		
		Product product = prepo.findByProductId(id);
		
		ProductCategory pcategory = new ProductCategory();
		System.out.println(pcategory.getDiscount());
			double discountPrice = (product.getProductPrice() * pcategory.getDiscount()) / 100;
			System.out.println(discountPrice);
			product.setDiscountPrice(discountPrice);
			double totalPrice = product.getProductPrice()-discountPrice;
			product.setFinalPrice(totalPrice);
			System.out.println(totalPrice);
	
		
		
		return product;
	}
	@Override
	public void editProductById(Product pdt,int id) 
	{
		prepo.save(pdt);
	}
	@Override
	public void deleteProductById(Integer id) 
	{
		 prepo.deleteById(id);
	}
	
}
