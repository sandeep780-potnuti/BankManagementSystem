package com.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.entity.BankUserDetails;

public interface BankUserRepository extends JpaRepository<BankUserDetails, Integer>{

}
