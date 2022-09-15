package com.company.factory.student;

import com.company.domain.student.StudentAddress;

public class StudentAddressFactory {
    private String studentId;
    private String address;

    public static StudentAddress getStudentAddress(String studentId, String address){
        return new StudentAddress.Builder().buildStudentId(studentId).buildAddress(address).build();
    }
}
