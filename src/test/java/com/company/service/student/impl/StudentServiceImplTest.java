package com.company.service.student.impl;

import com.company.domain.Name;
import com.company.domain.student.Student;
import com.company.factory.student.NameFactory;
import com.company.factory.student.StudentFactory;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class StudentServiceImplTest {
    StudentServiceImpl service1 = StudentServiceImpl.getStudentService();
    Name name = NameFactory.getName("espoir","Dite","M");
    Student espoir = StudentFactory.getStudent("209485","espoie@gmail",name);
    Student espoir2 = StudentFactory.getStudent("209485","espoie@gmail.com",name);
    @Test
    void getStudentService() {
    }

    @Test
    void A_create() {
        var result = service1.create(espoir);
        System.out.println(result);
        assertNotNull(result);
    }

    @Test
    void B_read() {
        var result = service1.read(espoir.getStudentId());
        System.out.println(result);
        assertNotNull(result);
    }

    @Test
    void C_update() {

        var result = service1.update(espoir2);
        System.out.println(result);
        assertNotNull(result);
    }
    @Test
    void D_readAll() {
        var result = service1.readAll();
        System.out.println(result);
        assertNotNull(result);
    }

    @Test
    void E_readByEmail() {
        var result = service1.readByEmail(espoir2.getEmail());
        System.out.println(result);
        assertNotNull(result);
    }

    @Test
    void F_delete() {
        var result = service1.delete(espoir2);
        System.out.println(result);
        assertTrue(result);
    }


}