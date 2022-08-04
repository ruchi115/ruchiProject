package com.product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class product {

	@Id
	int prodid;
	@Column(nullable = false)
	String productname;
	@Column(nullable = false)
	int price;
	@Column(nullable = false)
	int stock;
	@Column(nullable = false)
	String Description;
	@Column(nullable = false)
	String image;
	@Column(nullable = false)
	int sellerid;
	@Column(nullable = false)
	String category;
	@Column(nullable = false)
	String subcategory;
	@Column(nullable = false)
	int productrating;
	
	public int getProdid() {
		return prodid;
	}
	public void setProdid(int prodid) {
		this.prodid = prodid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getSellerid() {
		return sellerid;
	}
	public void setSellerid(int sellerid) {
		this.sellerid = sellerid;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSubcategory() {
		return subcategory;
	}
	public void setSubcategory(String subcategory) {
		this.subcategory = subcategory;
	}
	public int getProductrating() {
		return productrating;
	}
	public void setProductrating(int productrating) {
		this.productrating = productrating;
	}
}
