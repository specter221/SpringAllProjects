package com.stackroute.Insurance;

import org.springframework.stereotype.Component;

@Component
public class Claim {
	private String claimType;
	private String claimId;
	
	
	public void setClaimType(String claimType) {
		this.claimType = claimType;
	}
	public String getClaimType() {
		return claimType;
	}
	
	public void setClaimId(String claimId) {
		this.claimId = claimId;
	}
	public String getClaimId() {
		return claimId;
	}
	

}
