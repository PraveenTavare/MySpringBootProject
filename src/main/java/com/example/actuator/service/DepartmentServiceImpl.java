package com.example.actuator.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.actuator.entity.Department;
import com.example.actuator.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	private static final Logger log = LoggerFactory.getLogger(DepartmentServiceImpl.class);
	
	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public Department saveDepartment(Department department) {
		System.out.println("Entered saveDepartment()");
		log.info("New Department to be saved {}", department);
		Department deptEntity = new Department();
		deptEntity.setDepartmentName("IT");
		deptEntity.setDepartmentAddress("JP Nagar");
		return departmentRepository.save(deptEntity);
	}

}
