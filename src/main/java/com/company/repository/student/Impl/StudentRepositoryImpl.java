package com.company.repository.student.Impl;

import com.company.domain.student.Student;
import com.company.repository.student.StudentRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
//implement student repo
public class StudentRepositoryImpl implements StudentRepository {
    //declare
    private List<Student> studentList;
    private static StudentRepositoryImpl studentRepository = null;
    public static StudentRepositoryImpl getStudentRepository(){
        if (studentRepository == null) {
            studentRepository = new StudentRepositoryImpl();
        }
        return studentRepository;
    }
// constructor
    public StudentRepositoryImpl() {
        this.studentList = new ArrayList<>();
    }

    @Override
    public Student create(Student student) {
        boolean result = studentList.add(student);
        if (result){
            return student;
        }
        return null;
    }

    @Override
    public Student read(String id) {
        return studentList.stream().filter(D -> D.getStudentId().equals(id)).findAny().orElse(null);

    }

    @Override
    public Student update(Student student) {
        Student student1 = read(student.getStudentId());
        if(student1 != null){
            delete(student1);
            return create(student);
        }
        return null;
    }

    @Override
    public boolean delete(Student student) {
        var result = read(student.getStudentId());
        return studentList.remove(result);
    }

    @Override
    public Collection<Student> readAll() {
        return studentList;
    }

    @Override
    public Student readByEmail(String email) {
        return studentList.stream().filter(D ->D.getEmail().equals(email)).findAny().orElse(null);
    }
}
