package com.company.service.student.impl;

import com.company.domain.student.Student;
import com.company.repository.student.Impl.StudentRepositoryImpl;
import com.company.service.student.StudentService;

import java.util.Collection;

public class StudentServiceImpl implements StudentService{
    private StudentRepositoryImpl repository;
    private static StudentServiceImpl studentService = null;

    public static StudentServiceImpl getStudentService() {
        if(studentService == null){
            studentService = new StudentServiceImpl();
        }
        return studentService;
    }
    private StudentServiceImpl(){
        repository = new StudentRepositoryImpl();
    }
    @Override
    public Student create(Student student) {
        return repository.create(student);
    }

    @Override
    public Student read(String id) {
        return repository.read(id);
    }

    @Override
    public Student update(Student student) {
        return repository.update(student);
    }

    @Override
    public boolean delete(Student student) {
        return repository.delete(student);
    }

    @Override
    public Collection<Student> readAll() {
        return repository.readAll();
    }

    @Override
    public Student readByEmail(String email) {
        return repository.readByEmail(email);
    }
}