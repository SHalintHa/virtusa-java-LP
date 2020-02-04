package com.shalintha.training.salesmanager.service;

import com.shalintha.training.salesmanager.model.Employee;
import com.shalintha.training.salesmanager.repository.EmployeeRepository;
import com.shalintha.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

	
	EmployeeRepository employeeRepository;
    //EmployeeRepository employeeRepository = new HibernateEmployeeRepositoryImpl();
	
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		
		this.employeeRepository = employeeRepository;
	}

    @Override
    public List<Employee> getAllEmployees(){
        return employeeRepository.getAllEmployees();

    }
}
