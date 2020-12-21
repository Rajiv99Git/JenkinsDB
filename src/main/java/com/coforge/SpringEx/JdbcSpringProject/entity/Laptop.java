package com.coforge.SpringEx.JdbcSpringProject.entity;

public class Laptop {
	
	private int serial_No;
	private String processor;
	private String graphic_Card;
	private String Ram;
	private String Company;
	private int Price;
	
	
	public Laptop() {
		super();
	}
	public Laptop(int serial_No, String processor, String graphic_Card, String ram, String company, int price) {
		super();
		this.serial_No = serial_No;
		this.processor = processor;
		this.graphic_Card = graphic_Card;
		Ram = ram;
		Company = company;
		Price = price;
	}
	public int getSerial_No() {
		return serial_No;
	}
	public void setSerial_No(int serial_No) {
		this.serial_No = serial_No;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public String getGraphic_Card() {
		return graphic_Card;
	}
	public void setGraphic_Card(String graphic_Card) {
		this.graphic_Card = graphic_Card;
	}
	public String getRam() {
		return Ram;
	}
	public void setRam(String ram) {
		Ram = ram;
	}
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	
	

}
