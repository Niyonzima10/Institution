package com.company.factory.employee;

import com.company.domain.Name;
import com.company.domain.employee.Employee;

public class EmployeeFactory {


    public static Employee getEmployee(String staffId, Name name, String email){
        return new Employee.Builder().buildStaffId(staffId).buildName(name).buildEmail(email).build();

    }
}
