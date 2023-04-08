package com.neha.insurancemanagement.controller;

import org.junit.jupiter.api.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.http.ResponseEntity;

import com.neha.insurancemanagement.controller.ClientController;
import com.neha.insurancemanagement.model.Client;
import com.neha.insurancemanagement.service.impl.ClientServiceImpl;

public class ClientControllerTest {
	
	@InjectMocks
	ClientController controller;
	
	
	@Mock
	Client client;
	
	@Mock
	ClientServiceImpl clientSerivice;
	
	@Test
	public void getClientTest(){
		
		
		Mockito.when(clientSerivice.getClient(Mockito.anyLong())).thenReturn(client);
		
		
		ResponseEntity<Client> clientActual = controller.getClient((long) 7);
		Client Client2 = clientActual.getBody();
		
		Assertions.assertEquals(client, Client2);
		
	}

}
