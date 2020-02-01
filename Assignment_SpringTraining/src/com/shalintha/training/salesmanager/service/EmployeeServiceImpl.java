package com.shalintha.training.salesmanager.service;

import java.util.List;

import com.shalintha.training.salesmanager.model.Employee;
import com.shalintha.training.salesmanager.repository.EmployeeRepository;
import com.shalintha.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;

public class EmployeeServiceImpl implements EmployeeService {
	
	EmployeeRepository employeeRepository = new HibernateEmployeeRepositoryImpl();
	
	public List<Employee> getAllEmployees(){
		return employeeRepository.getAllEmployees();		
	}
	
	
	
	

}
