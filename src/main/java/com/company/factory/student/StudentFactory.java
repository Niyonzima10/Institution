package com.company.factory.student;

import com.company.domain.Name;
import com.company.domain.student.Student;

public class StudentFactory {
    private String studentId;
    private String email;
    private Name name;
    public static Student getStudent(String studentId, String email, Name name){
        return new Student.Builder().buildStudentId(studentId).builddEmail(email).buildName(name).Build();

    }

}
