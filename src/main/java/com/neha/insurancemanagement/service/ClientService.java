package com.neha.insurancemanagement.service;

import java.util.List;

import com.neha.insurancemanagement.model.Client;

public interface ClientService {
	
	List<Client> getClients();
	
	Client getClient(Long id);
	
	Client saveClient(Client client);
	
	void deleteClient(Long id);
	
}
