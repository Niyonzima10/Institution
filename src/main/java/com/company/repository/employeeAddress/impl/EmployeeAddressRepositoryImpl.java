package com.company.repository.employeeAddress.impl;

import com.company.domain.employee.EmployeeAddress;
import com.company.domain.location.Address;
import com.company.repository.employeeAddress.EmployeeAddressRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeAddressRepositoryImpl implements EmployeeAddressRepository {
    private List<EmployeeAddress> employeeAddressList;
    private static EmployeeAddressRepositoryImpl employeeAddressRepository = null;
    public static EmployeeAddressRepositoryImpl getEmployeeAddressRepository(){
        if(employeeAddressRepository == null){
            employeeAddressRepository = new EmployeeAddressRepositoryImpl();

        }
        return employeeAddressRepository;
    }
    public EmployeeAddressRepositoryImpl(){
        this.employeeAddressList = new ArrayList<>();
    }
    @Override
    public EmployeeAddress create(EmployeeAddress employeeAddress) {
        boolean result = employeeAddressList.add(employeeAddress);
        if(employeeAddress == null);
        if (result)
                return employeeAddress;
        return null;
    }

    @Override
    public EmployeeAddress read(String id) {
        return employeeAddressList.stream().filter(D -> D.getStaffId().equals(id)).findAny().orElse(null);

    }

    @Override
    public EmployeeAddress update(EmployeeAddress employeeAddress) {
        EmployeeAddress EmployeeAddress1 = read(employeeAddress.getStaffId());
        if(employeeAddress != null){
            delete(employeeAddress);
            return create(employeeAddress);
        }
        return null;
    }
    @Override
    public boolean delete(EmployeeAddress employeeAddress) {
        return employeeAddressList.remove(employeeAddress);
    }

    @Override
    public Collection<EmployeeAddress> readAll() {
        return employeeAddressList;
    }

    @Override
    public EmployeeAddress readByStaffId(String staffId) {
        return employeeAddressList.stream().filter(D ->D.getStaffId().equals(staffId)).findAny().orElse(null);
    }

    @Override
    public List<EmployeeAddress> readByAddress(Address address) {
        return employeeAddressList.stream().filter(D ->D.getAddress().equals(address)).collect(Collectors.toList());
    }
}
