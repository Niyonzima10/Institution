package com.company.repository.employeeAddress;

import com.company.domain.employee.EmployeeAddress;
import com.company.domain.location.Address;
import com.company.repository.Repository;

import java.util.List;

public interface EmployeeAddressRepository extends Repository<EmployeeAddress, String> {
    EmployeeAddress readByStaffId(String staffId);
    List<EmployeeAddress> readByAddress(Address address);
}
