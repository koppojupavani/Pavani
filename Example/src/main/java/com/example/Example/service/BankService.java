package com.example.Example.service;

import java.util.List;

import com.example.Example.Bluprint.Bank;

public interface BankService {
		Bank saveEmployee(Bank obj);//Restaurents-Employee
		List<Bank> fetchAllEmployee();
		
		 Object viewEmployefromDB();
}