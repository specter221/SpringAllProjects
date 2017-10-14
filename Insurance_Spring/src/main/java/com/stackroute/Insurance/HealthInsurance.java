package com.stackroute.Insurance;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HealthInsurance implements InsuranceSurveyor{

	Claim claim100;
	
	@Autowired
	public HealthInsurance(Claim claim100 ) {
		this.claim100=claim100;
		
	}
	
	public boolean Validate() {
		if(claim100.getClaimType().equals("Health"))
		{
			System.out.println("health insurance is verified");
			return true;
		}
		
		return false;
	}

}