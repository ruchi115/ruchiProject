package com.product.dto;

public class subsprod {
	int buyerid;
	int prodid;
	int qunatity;
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
		return qunatity;
	}
	public void setQunatity(int qunatity) {
		this.qunatity = qunatity;
	}
	@Override
	public String toString() {
		return "subsprod [buyerid=" + buyerid + ", prodid=" + prodid + ", qunatity=" + qunatity + "]";
	}
	

}
