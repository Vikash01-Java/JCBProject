package com.training.entity;

public class Vehicle {
	
	private String name;
	private String color;
	private int no;
	private int price;
	
	public Vehicle() {
		
	}

	public Vehicle(int no,String name, String color,int price) {
		super();
		this.name = name;
		this.color = color;
		this.no = no;
		this.price = price;
	}
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", color=" + color + ", no=" + no + ", price=" + price + "]";
	}

	
	

	
	
	
	

}
