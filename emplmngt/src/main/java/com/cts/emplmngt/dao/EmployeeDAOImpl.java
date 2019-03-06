package com.cts.emplmngt.dao;

import java.util.List;


import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.cts.emplmngt.bean.Employee;
import com.cts.emplmngt.util.HibernateUtil;



public class EmployeeDAOImpl implements EmployeeDAO {
	
	
	private SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
	
	private static EmployeeDAOImpl empDAOImpl;
	public static EmployeeDAOImpl getInstance(){
		if(empDAOImpl==null){ 
			empDAOImpl = new EmployeeDAOImpl();
			return empDAOImpl;
		}
		else{
			return empDAOImpl;
		}
		
	}
	private EmployeeDAOImpl(){
		
	}
	
	

	public String insertEmployee(Employee employee) {
		Session session=null;
		Transaction transaction=null;
		
		try{
		session= sessionFactory.openSession();
		transaction = session.getTransaction();
		System.out.println("Inside DAO");
		transaction.begin();
		session.save(employee);
		System.out.println("Tuple inserted");
		transaction.commit();
		
		return null;
		}
		
		catch(Exception e){
			
			if(transaction!=null){
				transaction.rollback();
			}
			e.printStackTrace();
		}
		
		finally{
			if(session!=null){
				session.close();
			}
		}
		return null;
	}
	
	public Employee getEmployeebyId(String id) {
		String query="from Empl WHERE empId=?";
		Session session=null;
		org.hibernate.query.Query<Employee> query2=null;
		
		try{
		session= sessionFactory.openSession();
		Employee employee = session.load(Employee.class, id);
		
		//query2=session.createQuery(query);
		//query2.setParameter(0, id);
		//List<Employee> list = query2.getResultList();
		System.out.println("Inside DAO- get all employeebyid");
		return employee;
		}
		
		catch(Exception e){
		
			e.printStackTrace();
		}
		
		finally{
			if(session!=null){
				session.close();
			}
		}
		return null;
	}
	
	public boolean updateEmployee(String id) {
		Session session=null;
		Transaction transaction=null;
		
		try{
		session= sessionFactory.openSession();
		transaction = session.getTransaction();
		System.out.println("Inside DAO - update");
		transaction.begin();
		session.update(id);
		System.out.println("Tuple inserted");
		transaction.commit();
		}
		catch(Exception e){
			
			if(transaction!=null){
				transaction.rollback();
			}
			e.printStackTrace();
		}
		
		finally{
			if(session!=null){
				session.close();
			}
		}
		return true;
	}

	public List<Employee> getAllEmployee() {
		String query="from Empl";
		Session session=null;
		org.hibernate.query.Query<Employee> query2=null;
		
		try{
		session= sessionFactory.openSession();
		query2=session.createQuery(query);
		
		List<Employee> list = query2.getResultList();
		System.out.println("Inside -DAO get all employee");
		return list;
		}
		
		catch(Exception e){
			
			e.printStackTrace();
		}
		finally{
			if(session!=null){
				session.close();
			}
		}
		return null;
	}

	public List<Employee> getAllEmployeeByName(String name) {
		// TODO Auto-generated method stub
		String query="from Empl";
		Session session=null;
		org.hibernate.query.Query<Employee> query2=null;
		
		try{
		session= sessionFactory.openSession();
		query2=session.createQuery(query);
		query2.setParameter(0, name);
		List<Employee> list = query2.getResultList();
		System.out.println("Inside DAO- get all employeebyname");
		return list;
		}
		catch(Exception e){
			
			e.printStackTrace();
		}
		
		finally{
			if(session!=null){
				session.close();
			}
		}
		
		return null;
	}
	
	public String deleteEmployeebyId(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
