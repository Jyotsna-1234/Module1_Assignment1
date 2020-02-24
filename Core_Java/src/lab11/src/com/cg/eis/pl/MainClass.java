package com.cg.eis.pl;
import java.util.Scanner;

import com.cg.eis.bean.*;
import com.cg.eis.service.*;
public class MainClass {
	static int id[]= {1001,1002,1003,1004};
	static String name[]= {"a kumar","b kumar","c kumar","d kumar"};
	static int salary[]= {20000,23000,4000,40000};
	static String designation[]= {"System associate","programmer","clerk","manager"};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee[]=new Employee[4];
		EmployeeService service=new EmployeeServiceImpl();
		
		for(int i=0;i<employee.length;i++)
		{
			employee[i]=new Employee(id[i],name[i],salary[i],designation[i]);
			service.employeeDetails(employee[i]);
			employee[i].setInsuranceScheme(service.findInsuranceScheme(salary[i], designation[i]));
		}
		service.displayDetail();

	}

}
