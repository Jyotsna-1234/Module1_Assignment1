package com.cg.eis.bean;

public class Employee {
	private int id;
	private String name;
	private float salary;
	private String designation;
	private String insuranceScheme;
	public Employee(int id, String name, float salary, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		if(salary>5000 && salary<20000 && designation.compareTo("system associate")==0)
		{
			insuranceScheme="c";
		}
		else if(salary>=20000 && salary<40000 && designation.compareTo("programmer")==0)
		{
			insuranceScheme="B";
		}
		else if(salary>=40000 && designation.compareTo("manager")==0)
		{
			insuranceScheme="A";
		}
		else if(salary<5000 && designation.compareTo("clerk")==0) {
			insuranceScheme="NO SCHEME";
		}	
	}
	public Employee()
	{
		
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public float getSalary() {
		return salary;
	}
	public String getDesignation() {
		return designation;
	}
	public String getINsuranceScheme() {
		return insuranceScheme;
	}
	
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	
	
}
