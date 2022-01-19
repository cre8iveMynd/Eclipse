package com.kt.springcorewithjavaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//java congiguration is the annotations are alternate for xml <bean> @Bean

@Configuration
@ComponentScan("com.kt.springvorewithjavaconfig")
public class AppConfig {
	
	@Bean("emp") //id=emp
	public Employee getEmployee()
	{
		Employee emp= new Employee();
		emp.setEid(100);
		emp.setEname("jayesh");
		
		return emp;
	}
	
	@Bean("add")
	public Address getAddres() {
		
		Address add= new Address();
		add.setColony("ramdug");
		return add;
	}

}
