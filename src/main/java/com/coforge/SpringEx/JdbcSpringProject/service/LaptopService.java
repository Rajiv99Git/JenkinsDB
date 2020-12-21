package com.coforge.SpringEx.JdbcSpringProject.service;

import java.util.List;

import com.coforge.SpringEx.JdbcSpringProject.entity.Laptop;

public interface LaptopService {
	
	public void addLaptop(Laptop laptop);
	public void editLaptop(Laptop laptop, int serial_No);
	public void deleteLaptop(int serial_No);
	public Laptop find(int serial_No);
	public List<Laptop> findAll();


}
