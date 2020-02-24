package com.cg.eis.service;
import java.util.HashMap;
import java.util.Scanner;
import com.cg.eis.bean.*;
public class EmployeeServiceImpl implements EmployeeService{

	HashMap<Integer,Employee> empMap;
	public EmployeeServiceImpl()
	{
		empMap=new HashMap<>();
	}

	@Override
	public void employeeDetails(Employee employee) {
		// TODO Auto-generated method stub
		empMap.put(employee.getId(),employee);
	}

	@Override
	public String findInsuranceScheme(float salary,String designation) {
		// TODO Auto-generated method stub
		for (int key:empMap.keySet()) {
			Employee emp1=empMap.get(key);
			if((emp1.getDesignation().equals(designation)) && (emp1.getSalary()==salary))
				return emp1.getINsuranceScheme();
		}
		
		return null;
	}

	@Override
	public void displayDetail() {
		// TODO Auto-generated method stub
		
		
	}
	
}
