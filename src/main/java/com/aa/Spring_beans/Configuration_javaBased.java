package com.aa.Spring_beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configuration_javaBased {

	    @Bean("Bean_name_Alok")
	    public Student_Model stdmethod() {
	        
	    	Student_Model std = new Student_Model();
	    	std.setMessage(" Hello world!");
	    	
	    
	        return std;
	    }

	}

