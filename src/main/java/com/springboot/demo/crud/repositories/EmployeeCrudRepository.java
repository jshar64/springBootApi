package com.springboot.demo.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.demo.crud.entity.Employee;

public interface EmployeeCrudRepository extends JpaRepository<Employee, Long> {
	
	

}