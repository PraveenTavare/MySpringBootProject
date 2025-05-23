package com.example.actuator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.actuator.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
	
}