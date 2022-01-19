package com.kt.SpringCoreMavenWithoutXML;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	//already we have two classes Employee, Address we need to create the object and return
	//here we are going to use "@Bean" Annotaion 
	// this complete class we can say = java configuration	
	
	@Bean("employee")
	public Employee getEmployee() {   // here method as bean tag in the xml  : employee bean tag
		
		Employee emp= new Employee();
		emp.setEid(100);
		emp.setEname("urmila");
		emp.setEsal(20000);
		return emp;
	}
	
	@Bean("address")
public Address getAddress() {
		
		Address add= new Address();
		add.setColony("usa");
		add.setState("usa");
		add.setStreetNum(02);
		return add;
	}


}
