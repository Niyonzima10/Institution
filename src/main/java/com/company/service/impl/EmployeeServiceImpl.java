package com.company.service.impl;

import com.company.repository.employee.impl.EmployeeRepositoryImpl;

public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeRepositoryImpl repository;
    private static EmployeeServiceImpl employeeService = null;

    public static EmployeeServiceImpl getEmployeeService(){
        if (employeeService == null){
            employeeService = new EmployeeServiceImpl();
        }
        return employeeService;
    }
}
