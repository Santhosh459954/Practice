package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Exception.ResourceNotFoundException;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	EmployeeRepository employeeRepository;

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(Long id) {
		return employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee", "id", id));
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		Employee employeeUpdated = null;
		/*
		 * if(employeeRepository.getById(employee.getId()) != null) { employeeUpdated =
		 * employeeRepository.save(employee); } else { throw new
		 * ResourceNotFoundException("Employee", "id", employee); }
		 */

		employeeUpdated = employeeRepository.findById(employee.getId())
				.orElseThrow(() -> new ResourceNotFoundException("Employee", "id", employee.getId()));
		employeeUpdated.setFirstName(employee.getFirstName());
		employeeUpdated.setLastName(employee.getLastName());
		employeeUpdated.setMail(employee.getMail());

		return employeeRepository.save(employeeUpdated);
	}

	@Override
	public void deleteEmployee(Long id) {
		if (employeeRepository.findById(id).get() != null) {
			employeeRepository.deleteById(id);
		} else {
			throw new ResourceNotFoundException("Employee", "id", id);
		}
	}
}
