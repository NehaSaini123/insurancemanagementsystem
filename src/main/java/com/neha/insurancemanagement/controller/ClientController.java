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

import com.neha.insurancemanagement.model.Client;
import com.neha.insurancemanagement.service.ClientService;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/api/clients")
public class ClientController {
	
	@Autowired
	private ClientService clientSerivice;

	@GetMapping("/")
	public ResponseEntity<List<Client>> getClient(){
		return new ResponseEntity<List<Client>>(clientSerivice.getClients(), HttpStatus.OK);
	} 
	
	@GetMapping("/{id}")
	public ResponseEntity<Client> getClient(@PathVariable Long id){
		return new ResponseEntity<Client>(clientSerivice.getClient(id), HttpStatus.OK);
	} 
	
	@PostMapping("/")
	public ResponseEntity<Client> saveClient(@Valid @RequestBody Client client){
		return new ResponseEntity<Client>(clientSerivice.saveClient(client), HttpStatus.CREATED);
	} 
	
	@PutMapping("/")
	public ResponseEntity<Client> updateClient(@Valid @RequestBody Client client){
		return new ResponseEntity<Client>(clientSerivice.saveClient(client), HttpStatus.OK);
	} 
	
	@DeleteMapping("/{id}")
	public void deletePolicy(@PathVariable Long id){
		clientSerivice.deleteClient(id);
	} 
}