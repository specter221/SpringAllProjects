package com.stackroute.Insurance;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class Insurance {
	final static Logger logger = Logger.getLogger(Insurance .class);

    public static Boolean Result() {
       
    	Claim claim=new Claim();
    	claim.setClaimId("1");
    	claim.setClaimType("Health");
    	
    	Customer customer=new Customer();
     	customer.setCustomerId("1");
        customer.setCustomerName("Rahul Bajaj");
    	
    	HealthInsurance healthinsurance = new HealthInsurance(claim);
    	
    	Manager manager = new Manager(healthinsurance);
    	return manager.approval();
    	
    	
    	
    }
	
}