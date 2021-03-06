package com.stackroute.Insurance;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Manager {

    HealthInsurance healthinsurance;
    
    @Autowired
    public Manager(HealthInsurance healthinsurance)
    {
    	this.healthinsurance=healthinsurance;
    }
    
    
    public boolean approval()
    {
    	if(healthinsurance.Validate()==(true))
    	{
    		System.out.println("Manager has approved your claim");
    		return true;
    	}
    	return false;
    	
  }
      
}