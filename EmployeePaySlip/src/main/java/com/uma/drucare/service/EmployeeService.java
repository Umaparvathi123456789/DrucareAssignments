package com.uma.drucare.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.uma.drucare.entity.Employee;
import com.uma.drucare.repo.EmployeeRepository;

@Service
public class EmployeeService {
@Autowired
EmployeeRepository employeeRepository;

//PostMapping
public Employee newEmployee(Employee employee) {
	return employeeRepository.save(employee);
}

//GetMapping
public List<Employee> allEmployees() {
	return employeeRepository.findAll();
}

//GetMapping for particular employee
public Optional<Employee> getEmployee(Long employeeId) {
	return employeeRepository.findById(employeeId);
}

//PutMapping
public Optional<Employee> updateEmployee(Employee employee, Long employeeId) {
	return employeeRepository.findById(employeeId);
}

//DeleteMapping
public String deleteEmployee(Long employeeId) {
	employeeRepository.deleteById(employeeId);
	return 	"sucessfully deleted";
}

public Page<Employee> getEmployeeByPage(Optional<Integer> pageNo, Optional<String> sortBy) {
return employeeRepository.findAll(PageRequest.of(pageNo.orElse(0),2,Direction.DESC,sortBy.orElse("employeeId")));
//int page = pageNo.orElse(0);
//int pageSize = 3;
//String sortBy1 = sortBy.orElse("employeeId");
//PageRequest pageRequest = PageRequest.of(page, pageSize, Sort.Direction.DESC, sortBy1);
//return employeeRepository.findAll(pageRequest);
//int page = pageNo.orElse(0);
//int pageSize = 3;
//String sortBy1 = sortBy.orElse("employeeId");
//PageRequest pageRequest = PageRequest.of(page, pageSize, Sort.Direction.DESC, sortBy);
//return  employeeRepository.findAll(pageRequest);

}
public List<Employee> searchEmployees(String query) {
	return employeeRepository.searchEmployee1(query);
}

public Page<Employee> getEmployeesSorted(int pageNo, int pageSize, String sortBy) {
    PageRequest pageRequest = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));
    return employeeRepository.findAll(pageRequest);
}

public List<Employee> getFilteredEmployees(String name, String role, String salary) {
    return employeeRepository.findByCriteria(name, role, salary);
}
}