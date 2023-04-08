package com.neha.insurancemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.neha.insurancemanagement.model.Client;

@Service
public interface ClientRepository extends JpaRepository<Client, Long>{

}
