package com.kt.SpringCoreWithMven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Test 
{
    public static void main( String[] args )
    {
        
    	
    	ApplicationContext factory= new ClassPathXmlApplicationContext("springConfig.xml"); //eager container
		
	     Employee emp =(Employee) factory.getBean("sleeping");
	     
	     System.out.println(emp);
    	
    	
    	
    }
}
