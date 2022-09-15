package com.company.repository.student.Impl;

import com.company.domain.Name;
import com.company.domain.student.Student;
import com.company.factory.student.NameFactory;
import com.company.factory.student.StudentFactory;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class StudentRepositoryImplTest {
     private static StudentRepositoryImpl REPOS=StudentRepositoryImpl.getStudentRepository();
     private static Name name = NameFactory.getName("Cairo", "Asher", "Kai");
     private static Student student = StudentFactory.getStudent("00945", "@gmail.com", name);

    @Test
    void create() {
     Student Create = REPOS.create(student);
     assertNotNull(Create);
        System.out.println(Create);
    }

    @Test
    void read() {
        String Id = student.getStudentId();
        Student Read = REPOS.read(Id);
        assertNotNull(Id);
        System.out.println(Id);
    }

    @Test
    void update() {
        String ID = String.valueOf(REPOS.update(student));
        Student UPDATE = REPOS.update(student);
        assertNotNull(ID);
        System.out.println(student);
    }

    @Test
    void delete() {
        String ID = student.getStudentId();
        boolean DELETE = REPOS.delete(student);
        assertNotNull(student);
        System.out.println(student);

    }

    @Test
    void readAll() {
        String ID = student.getStudentId();
        Collection<Student> READALL = REPOS.readAll();
        System.out.println(student);
    }

    @Test
    void readByEmail() {
        String ID = String.valueOf(REPOS.readByEmail("@gmail.com"));
        System.out.println(student);
    }
}