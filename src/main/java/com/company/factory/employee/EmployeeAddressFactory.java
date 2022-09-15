package com.company.factory.employee;

import com.company.domain.employee.EmployeeAddress;
import com.company.domain.location.Address;

public class EmployeeAddressFactory {


    public static EmployeeAddress getEmployeeAddress(String staffId, Address address){
       return new EmployeeAddress.Builder().buildStaffId(staffId).buildAddress(address).build();
    }
}
