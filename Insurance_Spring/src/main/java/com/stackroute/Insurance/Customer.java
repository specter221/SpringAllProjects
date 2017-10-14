package com.stackroute.Insurance;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	private String customerName;
	private String customerId;
	
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerName() {
		return customerName;
	}
	
	
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerId() {
		return customerId;
	}
	
	

}
