package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	private EmployeeService EmployeeService;

	public EmployeeController(EmployeeService EmployeeService) {
		super();
		this.EmployeeService = EmployeeService;
	}

	// http://localhost:8080/api/employees
	@PostMapping("api/employees")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
		return new ResponseEntity<Employee>(EmployeeService.saveEmployee(employee), HttpStatus.CREATED);
	}

	// http://localhost:8080/api/employees
	@GetMapping("api/employees")
	public List<Employee> getEmployee() {
		return EmployeeService.getAllEmployees();
	}

	// http://localhost:8080/api/employees/1
	@GetMapping("/api/employees/{id}")
	public ResponseEntity<Employee> getEmployee(@PathVariable("id") Long id) {
		return new ResponseEntity<Employee>(EmployeeService.getEmployeeById(id), HttpStatus.OK);
	}

	// http://localhost:api/employees
	@PutMapping("api/employees")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) {
		return new ResponseEntity<Employee>(EmployeeService.updateEmployee(employee), HttpStatus.OK);
	}

	// http://localhost:api/employees
	@DeleteMapping("api/employees/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable("id") Long id) {
		EmployeeService.deleteEmployee(id);
		return new ResponseEntity<String>("Employee deleted successfully", HttpStatus.OK);
	}
}
