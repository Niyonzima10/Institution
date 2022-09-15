package com.company.factory.employee;

import com.company.domain.Name;
import com.company.domain.employee.Employee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeFactoryTest {

    @Test
    void getEmployee() {
        Name name = new Name.Builder().buildName("Lee").buildMiddleName("leo").buildSurname("leee").Build();
        Employee employee = EmployeeFactory.getEmployee("P100",name,"lee.gmail.com");
        System.out.println(employee);

    }
}