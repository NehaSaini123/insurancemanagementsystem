package com.neha.insurancemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neha.insurancemanagement.model.InsurancePolicy;


public interface InsurancePolicyRepository extends JpaRepository<InsurancePolicy, Long>{

}
