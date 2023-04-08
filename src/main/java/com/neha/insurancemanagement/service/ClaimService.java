package com.neha.insurancemanagement.service;

import java.util.List;

import com.neha.insurancemanagement.model.Claim;

public interface ClaimService {
	List<Claim> getClaims();
	
	Claim getClaim(Long id);
	
	Claim saveClaim(Claim Claim);
	
	void deleteClaim(Long id);
}
