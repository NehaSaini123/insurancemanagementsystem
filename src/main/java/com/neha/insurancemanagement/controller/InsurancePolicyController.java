package com.neha.insurancemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neha.insurancemanagement.model.InsurancePolicy;
import com.neha.insurancemanagement.service.InsurancePolicyService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/policies")
public class InsurancePolicyController {
	
	@Autowired
	private InsurancePolicyService insurancePolicyService;

	@GetMapping("/")
	public ResponseEntity<List<InsurancePolicy>> getPolicies(){
		return new ResponseEntity<List<InsurancePolicy>>(insurancePolicyService.getPolicies(), HttpStatus.OK);
	} 
	
	@GetMapping("/{id}")
	public ResponseEntity<InsurancePolicy> getPolicy(@PathVariable Long id){
		return new ResponseEntity<InsurancePolicy>(insurancePolicyService.getPolicy(id), HttpStatus.OK);
	} 
	
	@PostMapping("/")
	public ResponseEntity<InsurancePolicy> saveInsurance(@Valid @RequestBody InsurancePolicy insurancePolicy){
		return new ResponseEntity<InsurancePolicy>(insurancePolicyService.saveInsurancePolicy(insurancePolicy), HttpStatus.CREATED);
	} 
	
	@PutMapping("/")
	public ResponseEntity<InsurancePolicy> updateInsurance(@Valid @RequestBody InsurancePolicy insurancePolicy){
		return new ResponseEntity<InsurancePolicy>(insurancePolicyService.saveInsurancePolicy(insurancePolicy), HttpStatus.OK);
	} 
	
	@DeleteMapping("/{id}")
	public void deletePolicy(@PathVariable Long id){
		insurancePolicyService.deletePolicy(id);
	} 
}
