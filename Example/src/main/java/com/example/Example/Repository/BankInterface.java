package com.example.Example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Example.Bluprint.Bank;

public interface BankInterface extends JpaRepository<Bank,Integer>{

}
