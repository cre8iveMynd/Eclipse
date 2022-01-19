package com.kt.springcorewithjavaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test 
{
    public static void main( String[] args )
    {
        
    	
    	//ApplicationContext factory= new ClassPathXmlApplicationContext("springConfig.xml"); //eager container
		  // HERE we are goint to use annotation for that we dont need xml configuration file
    	      // instead of XML we are created "class" make it as configration file
    	ApplicationContext factory= new AnnotationConfigApplicationContext(AppConfig.class);
    	
	     Employee emp =(Employee) factory.getBean("emp");
	     
	     System.out.println(emp);
	    
	     
    	
    	
    	
    }
}
