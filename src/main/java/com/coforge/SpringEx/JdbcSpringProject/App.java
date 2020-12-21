package com.coforge.SpringEx.JdbcSpringProject;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.coforge.SpringEx.JdbcSpringProject.entity.Laptop;
import com.coforge.SpringEx.JdbcSpringProject.service.LaptopService;
import com.coforge.SpringEx.config.ApplicationConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		LaptopService laptopService = (LaptopService) context.getBean("laptopService");
		
		Laptop hp =new Laptop(1,"i5","4GB","8","HP",40000);
		Laptop dell = new Laptop(2,"i3","2GB","4","Dell",30000);
		
		Laptop asus = new Laptop(3,"i3","2GB","4","Asus",30000);
		
		laptopService.addLaptop(hp);
		laptopService.addLaptop(dell);
		laptopService.addLaptop(asus);
		
		System.out.println("Find All");
		
		List<Laptop> laptops  = laptopService.findAll();
		for (Laptop laptop: laptops) { 
    		System.out.println(laptop); 
    	} 
		System.out.println("Delete Serial No. = 6");
		int deleteMe = 6;
		laptopService.deleteLaptop(deleteMe);
		
		System.out.println("Find All Again");
		laptops  = laptopService.findAll();
		for (Laptop laptop: laptops) { 
    		System.out.println(laptop); 
    	} 
	}

}
