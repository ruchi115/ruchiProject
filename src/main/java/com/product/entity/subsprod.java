package com.product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class subsprod {

	@Id
	int buyerid;
	@Column(nullable = false)
	int prodid;
	@Column(nullable = false)
	int quantity;
	
	public int getBuyerid() {
		return buyerid;
	}
	public void setBuyerid(int buyerid) {
		this.buyerid = buyerid;
	}
	public int getProdid() {
		return prodid;
	}
	public void setProdid(int prodid) {
		this.prodid = prodid;
	}
	public int getQunatity() {
		return quantity;
	}
	public void setQunatity(int qunatity) {
		this.quantity = qunatity;
	}
}
