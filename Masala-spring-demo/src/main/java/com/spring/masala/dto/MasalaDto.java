package com.spring.masala.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class MasalaDto {
	
	@Id
	private int id;
	
	private String brand;
	
	private String type;
	
	private int qty;
	
	private int price;

	public MasalaDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MasalaDto(int id, String brand, String type, int qty, int price) {
		super();
		this.id = id;
		this.brand = brand;
		this.type = type;
		this.qty = qty;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getBrand() {
		return brand;
	}

	public String getType() {
		return type;
	}

	public int getQty() {
		return qty;
	}

	public int getPrice() {
		return price;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Masaladto [id=" + id + ", brand=" + brand + ", type=" + type + ", qty=" + qty + ", price=" + price
				+ "]";
	}

}
