package com.company.repository.employee.impl;

import com.company.domain.Name;
import com.company.domain.employee.Employee;
import com.company.factory.employee.EmployeeFactory;
import com.company.factory.student.NameFactory;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class EmployeeRepositoryImplTest {

    private static EmployeeRepositoryImpl REPOS=EmployeeRepositoryImpl.getRepository();
   private static Name name= NameFactory.getName("CHANTAL","niyonzima","HILARY");
    private static Employee employee =EmployeeFactory.getEmployee("1234",name,"");
    @Test
    void A_create() {
        Employee Create= REPOS.create(employee);
        assertNotNull(Create);
        System.out.println(Create);
    }

    @Test
    void B_read() {
        String ID=employee.getStaffId();

        Employee READ=REPOS.read(ID);
        assertNotNull(READ);
        System.out.println(employee);
    }

    @Test
    void C_update() {
        String ID = employee.getStaffId();
        Employee UPDATE = REPOS.update(employee);
        assertNotNull(UPDATE);
        System.out.println(employee);
    }

    @Test
    void D_delete() {
        String ID = employee.getStaffId();
        boolean DELETE = REPOS.delete(employee);
        System.out.println(employee);
    }

    @Test
    void E_readAll() {
        String ID = employee.getStaffId();
        Collection<Employee> READALL =REPOS.readAll();
        System.out.println(employee);
    }
}