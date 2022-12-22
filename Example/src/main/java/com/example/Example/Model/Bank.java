package com.example.Example.Model;
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name="Banktable")

	public class Bank {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column
		private int  BankEmployeetId;
		
		@Column(nullable=false)
		private String  BankEmployeeName;
		
		@Column(nullable=false)
		private int BankEmployeeSalary ;
		
		@Column(nullable=false)
		private int BankEmployeeSections;
		
		public String getBankEmployeeName() {
			return BankEmployeeName;
		}
		public void setBankEmployeeName(String bankEmployeeName) {
			BankEmployeeName = bankEmployeeName;
		}
		
		public int getBankEmployeetId() {
			return BankEmployeetId;
		}
		public void setBankEmployeetId(int bankEmployeetId) {
			BankEmployeetId = bankEmployeetId;
		}
		
		public int getBankEmployeeSalary() {
			return BankEmployeeSalary;
		}
		public void setBankEmployeeSalary(int bankEmployeeSalary) {
			BankEmployeeSalary = bankEmployeeSalary;
		}
		public int getBankEmployeeSections() {
			return BankEmployeeSections;
		}
		public void setBankEmployeeSections(int bankEmployeeSections) {
			BankEmployeeSections = bankEmployeeSections;
		}
		}




