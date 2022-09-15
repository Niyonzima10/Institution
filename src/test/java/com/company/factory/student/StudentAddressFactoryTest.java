package com.company.factory.student;

import com.company.domain.Name;
import com.company.domain.student.Student;
import com.company.domain.student.StudentAddress;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentAddressFactoryTest {

    @Test
    void getStudentAddress(){
        StudentAddress studentAddress = new StudentAddress.Builder().buildAddress("candy street").buildStudentId("pk0012").build();
        System.out.println(studentAddress);
    }



}