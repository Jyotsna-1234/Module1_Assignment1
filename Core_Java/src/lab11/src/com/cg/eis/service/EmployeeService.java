package com.cg.eis.service;
import com.cg.eis.bean.*;
public interface EmployeeService {
	public void employeeDetails(Employee employee);
	public String findInsuranceScheme(float salary,String designations);
	public void displayDetail();
}
