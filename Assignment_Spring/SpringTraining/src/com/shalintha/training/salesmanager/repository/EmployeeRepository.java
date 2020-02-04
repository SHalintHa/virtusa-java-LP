package com.shalintha.training.salesmanager.repository;

import com.shalintha.training.salesmanager.model.Employee;

import java.util.List;

public interface EmployeeRepository {
    List<Employee> getAllEmployees();
}
