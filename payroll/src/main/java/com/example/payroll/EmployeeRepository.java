package com.example.payroll;

import org.springframework.data.jpa.repository.JpaRepository;

interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
//import org.springframework.data.repository.CrudRepository;
//
//import com.example.payroll.Employee;
//
// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
//
//public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
//
//}