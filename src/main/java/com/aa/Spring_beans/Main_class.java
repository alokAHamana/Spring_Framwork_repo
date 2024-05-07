package com.aa.Spring_beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main_class {
	
	
	    public static void main(String[] args) {
	        
	       // ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
	        ApplicationContext context = new AnnotationConfigApplicationContext(Configuration_javaBased.class);
	        
	        Model std = (Model) context.getBean("stdmethod");
	        std.getMessage();
	        
	        Model std2 = (Model)context.getBean("stdmethod");
	        std2.getMessage();
	        
	        //context.close();
	    }
	}
//By default scope of bean is singleton -> same object will get when get 