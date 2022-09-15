package com.company.repository.studentAddress;

import com.company.domain.student.StudentAddress;
import com.company.repository.Repository;

public interface StudentAddressRepository extends Repository<StudentAddress, String> {
    StudentAddress readByAddress (String Address);
    StudentAddress readByStudentAddress(String Address);
}
