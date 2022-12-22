package com.example.Example.implement;

import java.util.List;

import org.hibernate.annotations.FetchProfile.FetchOverride;
import org.springframework.stereotype.Service;

import com.example.Example.Bluprint.Bank;
import com.example.Example.Repository.BankInterface;
import com.example.Example.service.BankService;

@Service
	public class BankImpliment implements BankService{
		private BankInterface employeeInt;

		public BankImpliment(BankInterface employeeInt) {

			this.employeeInt = employeeInt;
		}
@Override
			public Bank saveEmployee(Bank obj) {//Restaurents-Salary
				return employeeInt.save(obj);  //insert query 
			}

			//get , find --> fetch only 1 rec on the basis id provided
			//findall
			@Override
			public List<Bank> fetchAllEmployee(){

				return employeeInt.findAll();//select * from learners_table
			}
			@Override
			public Object viewEmployefromDB() {
				// TODO Auto-generated method stub
				return null;
			}
			



}
			

