package com.neha.insurancemanagement.service;

import java.util.List;

import com.neha.insurancemanagement.model.InsurancePolicy;

public interface InsurancePolicyService {
	
	InsurancePolicy saveInsurancePolicy(InsurancePolicy insurancePolicy);
	
	List<InsurancePolicy> getPolicies();
	
	InsurancePolicy getPolicy(Long id);
	
	void deletePolicy(Long id);
	
	
}

 