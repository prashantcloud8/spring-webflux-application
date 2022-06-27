package com.web.flux.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.flux.spring.model.Employee;
import com.web.flux.spring.repository.EmployeeRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class EmployeeService {
	    @Autowired
	    EmployeeRepository employeeRepo;

	    public void createEmp(Employee employee) {
	        employeeRepo.save(employee).subscribe();
	    }

	    public Mono<Employee> findByEmpId(Integer id) {
	        return employeeRepo.findById(id);
	    }

	    public Flux<Employee> findAllEmp() {
	        return employeeRepo.findAll();
	    }

	    public Mono<Employee> updateEmp(Employee employee) {
	        return employeeRepo.save(employee);
	    }

	    public Mono<Void> deleteEmp(Integer id) {
	        return employeeRepo.deleteById(id);
	    }
}
