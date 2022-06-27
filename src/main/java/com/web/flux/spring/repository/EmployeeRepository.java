package com.web.flux.spring.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.web.flux.spring.model.Employee;

@Repository
public interface EmployeeRepository extends ReactiveMongoRepository<Employee, Integer> {
}
