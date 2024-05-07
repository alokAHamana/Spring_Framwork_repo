package com.aa.Spring_beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configuration_javaBased {

	    @Bean
	    public Model stdmethod() {
	        
	    	Model std = new Model();
	    	std.setMessage(" Hello world!");
	    	
	    	Model std2 = new Model();
	    	std2.setMessage(" Hiiiiiiiiiiii!");
	    
	        return std2;
	        
	    }

	}

