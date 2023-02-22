package com.example.helloworld.repository;

import com.example.helloworld.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>
{

}