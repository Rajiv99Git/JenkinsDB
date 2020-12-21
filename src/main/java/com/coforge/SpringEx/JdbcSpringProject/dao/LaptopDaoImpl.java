package com.coforge.SpringEx.JdbcSpringProject.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.coforge.SpringEx.JdbcSpringProject.entity.Laptop;


@Repository //mentions that the class provides the mechanism 
//for database CRUD operations on Objects 
@Qualifier("laptopDao") //qualifier mentions that if we have same name of id to avoid 
//the conflict of same names we use @Qualifier 
public class LaptopDaoImpl implements LaptopDao{

	@Autowired 
	JdbcTemplate jdbcTemplate; 
	@Override
	public void addLaptop(Laptop laptop) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("INSERT INTO LaptopData (serial_No, Processor," 
				+ " graphic_Card, RAM,Company,Price) VALUES (?, ?, ?, ?,?,?)", 
				laptop.getSerial_No(), laptop.getProcessor(), laptop.getGraphic_Card(), laptop.getRam(),laptop.getCompany(),laptop.getPrice()); 
					System.out.println("Laptop Added!!");
	}

	@Override
	public void editLaptop(Laptop laptop, int serial_No) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("UPDATE LaptopData SET Company = ? , " 
				+ "Price = ? WHERE serial_No = ? ", 
				laptop.getCompany(),laptop.getPrice(), serial_No); 
					System.out.println("Laptop Updated!!");
	}

	@Override
	public void deleteLaptop(int serial_No) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("DELETE from LaptopData WHERE serial_No = ?", serial_No); 
		System.out.println("Laptop Deleted!!"); 
	}
	@SuppressWarnings("unchecked") 
	@Override
	public Laptop find(int serial_No) {
		// TODO Auto-generated method stub
		@SuppressWarnings("rawtypes") 
		Laptop laptop = (Laptop) jdbcTemplate.queryForObject("SELECT * FROM " + "LaptopData where serial_No = ? ", new Object[] { serial_No }, new BeanPropertyRowMapper(Laptop.class)); 
		return laptop; 
	}
	@SuppressWarnings("rawtypes") 
	@Override
	public List<Laptop> findAll() {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked") 
		List <Laptop> laptops = jdbcTemplate.query("SELECT * FROM LaptopData", new BeanPropertyRowMapper(Laptop.class)); 
		return laptops; 
	}

}
