package com.company.repository.studentAddress.impl;

import com.company.domain.student.StudentAddress;
import com.company.repository.studentAddress.StudentAddressRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StudentAddressRepositoryImpl implements StudentAddressRepository {
    private List<StudentAddress> StudentAddressList;
    private static StudentAddressRepositoryImpl studentAddressRepository = null;

    public static StudentAddressRepositoryImpl getStudentAddressRepository() {
        if (studentAddressRepository == null) ;
        studentAddressRepository = new StudentAddressRepositoryImpl();

        return studentAddressRepository;
    }

    public StudentAddressRepositoryImpl() {
        this.StudentAddressList = new ArrayList<>();
    }

    @Override
    public StudentAddress create(StudentAddress studentAddress) {
    boolean add= StudentAddressList.add(studentAddress);
    if (add){
        return studentAddress;
    }
        return null;
    }

    @Override
    public StudentAddress read(String id) {
        StudentAddress studentAddress =
                StudentAddressList.stream().filter(idnumber->idnumber.getStudentId()
                        .equals(id)).findAny().orElse(null);

        return studentAddress;
    }
    @Override
    public StudentAddress update(StudentAddress studentAddress) {
        StudentAddress studentAddress1= read(studentAddress.getStudentId());
        if(studentAddress1 != null){
            StudentAddressList.remove(studentAddress1);
            StudentAddressList.add(studentAddress);
            return create(studentAddress);
        }
        return null;
    }
    @Override
    public boolean delete(StudentAddress studentAddress) {
        return StudentAddressList.remove(studentAddress);
    }

    @Override
    public Collection<StudentAddress> readAll() {
        return StudentAddressList;
    }
    @Override
    public StudentAddress readByAddress(String Address) {
        return StudentAddressList.stream().filter(D -> D.getAddress().equals(Address)).findAny().orElse(null);
    }

    @Override
    public StudentAddress readByStudentAddress(String Address) {
        return null;
    }
}