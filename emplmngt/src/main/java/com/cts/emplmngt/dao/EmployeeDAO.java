package com.cts.emplmngt.dao;

import java.util.List;

import com.cts.emplmngt.bean.Employee;




public interface EmployeeDAO {

	public String insertEmployee(Employee employee);
	public String deleteEmployeebyId(String id);
	public Employee getEmployeebyId(String id);
	public boolean updateEmployee(String id);
	public List<Employee> getAllEmployee();
	public List<Employee> getAllEmployeeByName(String name);
	
}
