package com.company.factory.employee;

import com.company.domain.employee.Employee;
import com.company.domain.employee.EmployeeAddress;
import com.company.domain.location.Address;
import com.company.domain.location.City;
import com.company.domain.location.Country;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeAddressFactoryTest {

    @Test
    void getEmployeeAddress() {
        Country country = new Country.Builder().buildName("South Africa").buildId("9876").build();
        City city = new City.Builder().buildName("cape town").buildCountry(country).buildId("1234").build();
        Address address = new Address.Builder().buildCity(city).buildPostalCode(7740).buildComplexName("ALICE").buildStreetName("rose").buildStreetNumber(12).buildUnitNumber("a15").build();
        EmployeeAddress employeeAddress =  EmployeeAddressFactory.getEmployeeAddress("PK27", address);
        System.out.println(employeeAddress);
    }
}