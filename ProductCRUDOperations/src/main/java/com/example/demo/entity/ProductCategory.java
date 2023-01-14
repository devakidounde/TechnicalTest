package com.example.demo.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="product_category")
public class ProductCategory 
{
	@Id
	private int productCategoryID;
	private String productCategory;
	private double Discount;
	private double gst;
	private int deliveyCharge;
	
	@OneToMany(mappedBy="productCategory")
	private Set<Product> product;

	public int getProductCategoryID() {
		return productCategoryID;
	}
	public void setProductCategoryID(int productCategoryID) {
		this.productCategoryID = productCategoryID;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public double getDiscount() {
		return Discount;
	}
	public void setDiscount(double discount) {
		Discount = discount;
	}
	public double getGst() {
		return gst;
	}
	public void setGst(double gst) {
		this.gst = gst;
	}
	public int getDeliveyCharge() {
		return deliveyCharge;
	}
	public void setDeliveyCharge(int deliveyCharge) {
		this.deliveyCharge = deliveyCharge;
	}
	@Override
	public String toString() {
		return "ProductCategory [productCategoryID=" + productCategoryID + ", productCategory=" + productCategory
				+ ", Discount=" + Discount + ", gst=" + gst + ", deliveyCharge=" + deliveyCharge + "]";
	}
	
	
	
}
