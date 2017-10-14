package com.stackroute.jdbcdemo;

import javax.persistence.Entity;
import javax.persistence.Id;

//import org.hibernate.annotations.Entity;

@Entity
public class Circle {
	@Id
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Circle(int circleId, String name) {// constructor that takes in id and name
		
		setId(circleId);
		setName(name);
	}
	public Circle() {
		
}
	

}
