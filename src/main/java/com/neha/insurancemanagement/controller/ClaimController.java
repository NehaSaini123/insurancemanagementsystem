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

import com.neha.insurancemanagement.model.Claim;
import com.neha.insurancemanagement.service.ClaimService;

import jakarta.validation.Valid;



@RestController
@RequestMapping("/api/claims")
public class ClaimController {
	
	@Autowired
	private ClaimService claimSerivice;

	@GetMapping("/")
	public ResponseEntity<List<Claim>> getClient(){
		return new ResponseEntity<List<Claim>>(claimSerivice.getClaims(), HttpStatus.OK);
	} 
	
	
	@GetMapping("/{id}")
	public ResponseEntity<Claim> getClient(@PathVariable Long id){
		return new ResponseEntity<Claim>(claimSerivice.getClaim(id), HttpStatus.OK);
	} 
	
	@PostMapping("/")
	public ResponseEntity<Claim> saveClient(@Valid @RequestBody Claim claim){
		return new ResponseEntity<Claim>(claimSerivice.saveClaim(claim), HttpStatus.CREATED);
	} 
	
	@PutMapping("/")
	public ResponseEntity<Claim> updateClient(@Valid @RequestBody Claim claim){
		return new ResponseEntity<Claim>(claimSerivice.saveClaim(claim), HttpStatus.OK);
	} 
	
	@DeleteMapping("/{id}")
	public void deletePolicy(@PathVariable Long id){
		claimSerivice.deleteClaim(id);
	} 
}