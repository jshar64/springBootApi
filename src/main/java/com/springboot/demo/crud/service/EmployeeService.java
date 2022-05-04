package com.springboot.demo.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.demo.crud.entity.Employee;
import com.springboot.demo.crud.exceptions.EmptyInputException;
import com.springboot.demo.crud.repositories.EmployeeCrudRepository;

@Service
public class EmployeeService implements EmployeeServiceInterface {

	@Autowired
	private EmployeeCrudRepository employeeCrudRepository;

	@Override
	public Employee addEmployee(Employee employee) {
		if (employee.getName().isEmpty() || employee.getName().length() == 0) {
			throw new EmptyInputException("501", "Input fields are empty");
		}
		Employee savedEmployee = employeeCrudRepository.save(employee);
		return savedEmployee;

	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeCrudRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(Long id) {
		return employeeCrudRepository.findById(id).get();

	}

	@Override
	public void deleteEmployeeById(Long id) {
		employeeCrudRepository.deleteById(id);

	}

}
