package com.uma.drucare.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.uma.drucare.entity.Employee;
import com.uma.drucare.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/add/employee")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
		return new ResponseEntity<>(employeeService.newEmployee(employee),HttpStatus.OK);
	}
	@GetMapping("/all/employees")
	public ResponseEntity<List<Employee>> allEmployees(){
		return new ResponseEntity<>(employeeService.allEmployees(),HttpStatus.OK);
	}
	@GetMapping("/{employeeId}")
	public ResponseEntity<Employee> getEmployee(@PathVariable Long employeeId) {
	Optional<Employee> employee=employeeService.getEmployee(employeeId);
		return employee.map(details -> new ResponseEntity<>(details, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
	@PutMapping("/update/{employeeId}")
	public  ResponseEntity<Employee>  updateEmployee(@RequestBody Employee employee, @PathVariable Long employeeId) {
		Optional<Employee> employeeDetails= employeeService.updateEmployee(employee,employeeId);
		return employeeDetails.map(details->new ResponseEntity<>(details, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
	@DeleteMapping("delete/{employeeId}")
	public ResponseEntity<String> deleteEmployee(@PathVariable Long employeeId) {
		return new ResponseEntity<>(employeeService.deleteEmployee(employeeId),HttpStatus.OK);
	}
	
//Pages
	@GetMapping("/page/number")
	public  ResponseEntity<Page<Employee>> getEmployees(@RequestParam("pageNo") Optional<Integer> pageNo,@RequestParam("sort") Optional<String> soryBy) {
        Page<Employee> employees = employeeService.getEmployeeByPage(pageNo, soryBy);
        return new ResponseEntity<>(employees, HttpStatus.OK);
	}
	
//Searching
	@GetMapping("/search")
	public ResponseEntity<List<Employee>> searchEmployee(@RequestParam("query") String query) {
    List<Employee> employees = employeeService.searchEmployees(query);
    if (employees.isEmpty()) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    return new ResponseEntity<>(employees, HttpStatus.OK);
	}
	
//Sorting
    @GetMapping("/sorted")
    public ResponseEntity<Page<Employee>> getEmployeesSorted(
            @RequestParam("pageNo") int pageNo,
            @RequestParam("pageSize") int pageSize,
            @RequestParam("sortBy") String sortBy) {
        Page<Employee> sortedEmployees = employeeService.getEmployeesSorted(pageNo, pageSize, sortBy);
        return ResponseEntity.ok(sortedEmployees);
    }
    
//Filter
    @GetMapping("/filter")
    public ResponseEntity<List<Employee>> getFilteredEmployees(
            @RequestParam(value = "name", required = false) String name,
            @RequestParam(value = "role", required = false) String role,
            @RequestParam(value = "salary", required = false) String salary) {
        List<Employee> filteredEmployees = employeeService.getFilteredEmployees(name, role, salary);
        return ResponseEntity.ok(filteredEmployees);   
    }
}
