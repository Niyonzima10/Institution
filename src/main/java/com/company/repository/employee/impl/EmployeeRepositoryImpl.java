package com.company.repository.employee.impl;

import com.company.domain.employee.Employee;
import com.company.repository.employee.EmployeeRepository;

import java.util.*;

public class EmployeeRepositoryImpl implements EmployeeRepository {

    private static EmployeeRepositoryImpl repository= null;
    private Set<Employee>DATABASE;

    public EmployeeRepositoryImpl (){
        DATABASE = new HashSet<Employee>();
    }
    public static EmployeeRepositoryImpl getRepository(){
        if(repository==null){
            repository= new EmployeeRepositoryImpl();
        }
        return repository;
    }

    @Override
    public Employee create(Employee employee) {
        boolean save=DATABASE.add(employee);
        if(!save){
            return null;
        }
        return employee;
    }

    @Override
    public Employee read(String id) {
        Employee red=DATABASE.stream().filter(employee1 -> employee1.getStaffId().equals(id))
                .findAny().orElse(null);
        return  red;
    }

    @Override
    public Employee update(Employee employee) {
        Employee employee1=read(employee.getStaffId());
        if(employee1 !=null){

            DATABASE.remove(employee1);
            DATABASE.add(employee);
        }
        return null;
    }
    @Override
    public Employee readByEmail(String email) {
        //Employee employee=
        return null;
    }

    @Override
    public boolean delete(Employee employee) {
        Employee delete=read(employee.getStaffId());
        if(delete !=null){

            DATABASE.remove(delete);
        }
        return false;
    }

    @Override
    public Collection<Employee> readAll() {
        return DATABASE;
    }


}
