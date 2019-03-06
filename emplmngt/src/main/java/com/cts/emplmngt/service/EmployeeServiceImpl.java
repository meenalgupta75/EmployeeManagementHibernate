package com.cts.emplmngt.service;

import java.util.List;


import com.cts.emplmngt.bean.Employee;

import com.cts.emplmngt.dao.EmployeeDAO;
import com.cts.emplmngt.dao.EmployeeDAOImpl;



public class EmployeeServiceImpl implements EmployeeService {

	
	private static EmployeeServiceImpl empSeviceImpl;
	private EmployeeDAO e_dao= EmployeeDAOImpl.getInstance();
	public static EmployeeServiceImpl getInstance(){
		if(empSeviceImpl==null){ 
			empSeviceImpl = new EmployeeServiceImpl();
			return empSeviceImpl;
		}
		else{
			return empSeviceImpl;
		}
		
	}
	
	
	public String insertEmployee(Employee employee) {
		System.out.println("Inside service insertEmployee");
		return e_dao.insertEmployee(employee);
	}
	
	public Employee getEmployeebyId(String id) {
		System.out.println("Inside service getEmployeeById");
		return e_dao.getEmployeebyId(id);
		
	}
	public boolean updateEmployee(String id) {
		System.out.println("Inside service updateEmployee");
		return e_dao.updateEmployee(id);
	}
	public List<Employee> getAllEmployee() {
		System.out.println("Inside service getallEmployee");
		return e_dao.getAllEmployee();
	}
	public List<Employee> getAllEmployeeByName(String name) {
		System.out.println("Inside service getEmployeeByname");
		return e_dao.getAllEmployeeByName(name);
	}


	public String deleteEmployeebyId(String id) {
		// TODO Auto-generated method stub
		System.out.println("Inside service delete");
		return e_dao.deleteEmployeebyId(id);
	}


	


	
}
