package com.company.service.student;

import com.company.domain.student.Student;
import com.company.service.ServiceInterface;

public interface StudentService extends ServiceInterface<Student,String> {
        Student readByEmail(String email);
}
