package com.company.repository.student;

import com.company.domain.student.Student;
import com.company.repository.Repository;

public interface StudentRepository extends Repository<Student, String> {
    Student readByEmail(String email);
}
