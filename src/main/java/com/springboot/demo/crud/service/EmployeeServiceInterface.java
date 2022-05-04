package com.springboot.demo.crud.service;

import java.util.List;
import com.springboot.demo.crud.entity.Employee;

public interface EmployeeServiceInterface {
	public Employee addEmployee(Employee employee);

	public List<Employee> getAllEmployees();

	public Employee getEmployeeById(Long id);

	public void deleteEmployeeById(Long id);

}
