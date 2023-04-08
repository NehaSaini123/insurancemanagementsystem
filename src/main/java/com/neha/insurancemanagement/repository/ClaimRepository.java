package com.neha.insurancemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neha.insurancemanagement.model.Claim;

public interface ClaimRepository extends JpaRepository<Claim , Long>{

}
