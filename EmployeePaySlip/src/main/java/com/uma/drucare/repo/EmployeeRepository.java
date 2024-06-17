package com.uma.drucare.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.uma.drucare.entity.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
//	@Query(value = "select * from employee_table where employeeName like concat('%',:query,'%')",nativeQuery = true)
//	List<Employee> searchEmployee1(String query);

	//jpql
	//paging query
@Query(value = "select e from Employee e where e.employeeName like concat('%',:query,'%')")

//search emplyee by query
	List<Employee> searchEmployee1(String query);

//filter query
@Query("SELECT e FROM Employee e WHERE " +"(:name IS NULL OR e.employeeName LIKE %:name%) AND " +"(:role IS NULL OR e.employeeRole = :role) AND " + "(:salary IS NULL OR e.employeeSalary = :salary)")
List<Employee> findByCriteria(@Param("name") String name, @Param("role") String role,@Param("salary") String salary);
                          
}
