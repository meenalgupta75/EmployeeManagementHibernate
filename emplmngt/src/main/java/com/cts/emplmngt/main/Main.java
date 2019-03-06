package com.cts.emplmngt.main;

import com.cts.emplmngt.bean.Employee;
import com.cts.emplmngt.service.EmployeeService;
import com.cts.emplmngt.service.EmployeeServiceImpl;

public class Main {
	public static void main(String[] args){
		System.out.println("Hello world");
		
		EmployeeService esi= new EmployeeServiceImpl();
		Employee employee=new Employee("abc", "abc", "abc", 1);
		esi.insertEmployee(employee);
		String id="abc";
		
		System.out.println(esi.getEmployeebyId(id));
		System.out.println(esi.getEmployeebyId(id));
		
	}

	
	

}
