package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmployeeService {

	public Employee saveEmployee(Employee employee);

	public List<Employee> getAllEmployees();

	public Employee getEmployeeById(Long id);

	public Employee updateEmployee(Employee employee);

	public void deleteEmployee(Long id);
}
