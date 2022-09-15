package com.company.factory.student;

import com.company.domain.Name;
import com.company.domain.student.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentFactoryTest {

    @Test
    void getStudent() {
        Name name = new Name.Builder().buildName("king").buildMiddleName("key").buildSurname("pierre").Build();
        Student student = new Student.Builder().buildStudentId("kp9748").buildName(name).builddEmail("@mail").Build();
        System.out.println(student);


    }
}