package com.kt.SpringCoreMavenWithoutXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@Configuration
@ComponentScan("com.kt.SpringCoreMavenWithoutXML")
public class Test 
{
    public static void main( String[] args )
    {
        
    	
    	//ApplicationContext factory= new ClassPathXmlApplicationContext("springConfig.xml"); //eager container
		  // HERE we are goint to use annotation for that we dont need xml configuration file
    	      // instead of XML we are created "class" make it as configration file
    	ApplicationContext factory= new AnnotationConfigApplicationContext(Test.class);
    	
	     Employee emp =(Employee) factory.getBean("keerthi"); // without giving eny it will take employee class in smalle letters
	     
	     emp.setEid(143);
	     emp.setEname("keerthi");
	     
	  //   System.out.println(emp);
	     
	     Address address =(Address) factory.getBean("urmila"); //addres object
	    
	     address.setColony("swamy ramana");
	     address.setState("usa");
    	emp.setAddress(address);
    	
    	System.out.println(emp);
    	
    }
}
