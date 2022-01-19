package com.kt.SpringCoreMavenWithoutXML;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


//here without writing java methods we ca do with annotations

 //if we provide package it wil go there call the object
public class AppConfig {
	
	//already we have two classes Employee, Address we need to create the object and return
	//here we are going to use "@Bean" Annotaion 
	// this complete class we can say = java configuration	
	
//	@Bean("sleeping")
//	public Employee getEmployee() {   // here method as bean tag in the xml  : employee bean tag
//		
//		Employee emp= new Employee();
//		emp.setEid(100);
//		emp.setEname("Divya");
//		emp.setEsal(90000);
//		return emp;
//	}
//	
//	@Bean("address")
//public Address getAddress() {
//		
//		Address add= new Address();
//		add.setColony("alkapuri colony");
//		add.setState("telangana");
//		add.setStreetNum(02);
//		return add;
//	}
	
   

}
