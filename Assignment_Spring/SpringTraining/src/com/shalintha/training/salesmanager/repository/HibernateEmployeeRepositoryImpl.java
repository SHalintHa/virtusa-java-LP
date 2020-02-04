package com.shalintha.training.salesmanager.repository;

import com.shalintha.training.salesmanager.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {

    @Override
    public List<Employee> getAllEmployees(){
        List<Employee> employees = new ArrayList<>();

        Employee employee = new Employee();
        employee.setEmployeeName("Shalintha");
        employee.setEmployeeLocation("Ragama");
        employees.add(employee);

        return employees;
    }
}
