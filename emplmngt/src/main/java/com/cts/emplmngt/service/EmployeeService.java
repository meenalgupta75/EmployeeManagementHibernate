package com.cts.emplmngt.service;

import java.util.List;

import com.cts.emplmngt.bean.Employee;




public interface EmployeeService {

	public String insertEmployee(Employee employee);
	public String deleteEmployeebyId(String id);
	public Employee getEmployeebyId(String id);
	public boolean updateEmployee(String id);
	public List<Employee> getAllEmployee();
	public List<Employee> getAllEmployeeByName(String name);
}
