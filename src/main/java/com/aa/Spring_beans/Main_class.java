package com.aa.Spring_beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main_class {
	
	
	    public static void main(String[] args) {
	        
	        // ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configuration_javaBased.class);
	        
	        Student_Model std = (Student_Model)context.getBean("Bean_name_Alok");
	        std.getMessage();
	        
	        context.close();
	    }
	}
//By default scope of bean is singleton -> same object will get when get 