package com.company.repository.employee;

import com.company.domain.employee.Employee;
import com.company.repository.Repository;

public interface EmployeeRepository extends Repository<Employee, String> {
    Employee readByEmail(String email);








}
