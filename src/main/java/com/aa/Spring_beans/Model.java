package com.aa.Spring_beans;

public class Model {

	 private String message;

	    public void setMessage(String message) {
	        this.message = message;
	    }

	    public void getMessage() {
	        System.out.println("My Message : " + message);
	    }

}
