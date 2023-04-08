package com.neha.insurancemanagement.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neha.insurancemanagement.model.Claim;
import com.neha.insurancemanagement.repository.ClaimRepository;
import com.neha.insurancemanagement.service.ClaimService;

@Service
public class ClaimServiceImpl implements ClaimService{

	@Autowired
	private ClaimRepository claimRepository;
	
	@Override
	public List<Claim> getClaims() {
		return claimRepository.findAll();
	}

	@Override
	public Claim getClaim(Long id) {
		Optional<Claim> claim =claimRepository.findById(id);
		if(claim.isPresent()) {
			return claim.get();
		}
		return null;
	}

	@Override
	public Claim saveClaim(Claim claim) {
		return claimRepository.save(claim); 
	}

	@Override
	public void deleteClaim(Long id) {
		claimRepository.deleteById(id);
	}
}
