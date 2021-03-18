package com.company.Employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.company.Employee.model.EmployeeEntity;


public interface EmployeeRepository  extends JpaRepository<EmployeeEntity, Integer>{
	@Query(value="select * from employee", nativeQuery=true)
	List<Object[]> retriveAllEmp();
}
