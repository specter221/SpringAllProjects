package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
	String hello;
	Greeting gb;
	
	public String getHello() {
    	System.out.println("Hello World");
        gb.greetingBank();
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
		
	}
     
	@Autowired
	 public HelloWorld(Greeting gb){
		this.gb=gb;
        }
 }
