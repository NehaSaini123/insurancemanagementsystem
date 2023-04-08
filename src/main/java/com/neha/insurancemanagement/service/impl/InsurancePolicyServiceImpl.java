package com.neha.insurancemanagement.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neha.insurancemanagement.model.InsurancePolicy;
import com.neha.insurancemanagement.repository.InsurancePolicyRepository;
import com.neha.insurancemanagement.service.InsurancePolicyService;

@Service
public class InsurancePolicyServiceImpl implements InsurancePolicyService{

	@Autowired
	private InsurancePolicyRepository insurancePolicyRepository;
	

	@Override
	public InsurancePolicy saveInsurancePolicy(InsurancePolicy insurancePolicy) {
	
		return insurancePolicyRepository.save(insurancePolicy);
	}


	@Override
	public List<InsurancePolicy> getPolicies() {
		
		return insurancePolicyRepository.findAll();
	}


	@Override
	public InsurancePolicy getPolicy(Long id) {
		Optional<InsurancePolicy> InsurancePolicy = insurancePolicyRepository.findById(id);
		if(InsurancePolicy.isPresent()) {
			return InsurancePolicy.get();
		}
		return null;
	}


	@Override
	public void deletePolicy(Long id) {
		insurancePolicyRepository.deleteById(id);
		
	}

}