package com.cts.emplmngt.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Empl")
@Table(name="empl_Table")
public class Employee {
	private Address address;
	
	@Id
	@Column(name="empID", nullable = false,unique= true )
	private String empID;
	private static Employee employee;
	
	
	public class Address{
		private String address;

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}
	}
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ ", getEmpID()=" + getEmpID() + ", getFirstName()=" + getFirstName() + ", getLastName()="
				+ getLastName() + ", getSalary()=" + getSalary() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	public Employee(){
		
	}
	
	@Column(name = "firstName", nullable = false)
	private String firstName;
	
	@Column(name = "lastName",nullable = false)
	private String lastName;
	
	@Column(name = "salary",nullable = false)
	float salary;
	
	public String getEmpID() {
		return empID;
	}
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Employee(String empID, String firstName, String lastName, float salary) {
		super();
		this.empID = empID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

}
