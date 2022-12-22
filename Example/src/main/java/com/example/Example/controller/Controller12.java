package com.example.Example.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import com.example.Example.Bluprint.Bank;
import com.example.Example.service.BankService;

@Controller
	public class Controller12 {
		private BankService bankServ;
		
		public Controller12(BankService bankServ) {
			this.bankServ = bankServ;
		}
		@GetMapping("/viewAllEmployee")
		//public List<Bank> getAllemployeeFromDb(){//Learners-employee
   public String listOfEmployee(Model model) {
	model.addAttribute("EmployeeList",bankServ.fetchAllEmployee());
	return "Employee";  //students.html//students-Employee
	}
			
		@GetMapping("Employee/createNewEmployee")
		public String createBank(Model model) {
			Bank emptyObjTostoreValFromFE = new Bank();
			model.addAttribute("stdObj", emptyObjTostoreValFromFE);
			return "createEmployee";
		}
		@PostMapping("/insert")
		//when u try to insert a rec
		//@reqBod --> when u r expectmg an obj frm the url
		public ResponseEntity<Bank> saveEmployee(@RequestBody Bank obj) {//Restaurents-Employee
		System.out.println(obj.getBankEmployeeName() + obj.getBankEmployeeSections());
			return new ResponseEntity<Bank>(bankServ.saveEmployee(obj), 
					HttpStatus.CREATED);	
		}
		
}
