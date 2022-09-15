package com.company;

import com.company.domain.Name;
import com.company.domain.employee.Employee;
import com.company.domain.employee.EmployeeAddress;
import com.company.domain.location.Address;
import com.company.domain.location.City;
import com.company.domain.location.Country;
import com.company.domain.student.Student;
import com.company.domain.student.StudentAddress;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Country country = new Country.Builder().buildId("k888").buildName("South Africa").build();
        City city = new City.Builder().buildId("k555").buildName("Cape Town").buildCountry(country).build();
        Address address = new Address.Builder().buildUnitNumber("A10").buildComplexName("Frangipani").buildStreetNumber(15).buildStreetName("alice").buildPostalCode(4704).buildCity(city).build();
        EmployeeAddress employeeAddress = new EmployeeAddress.Builder().buildStaffId("pn345").buildAddress(address).build();
        Employee employee = new Employee.Builder().buildStaffId("P3337").buildEmail("lala.gmail.com").build();
        StudentAddress studentAddress = new StudentAddress.Builder().buildStudentId("G007").buildAddress("35 vineland").build();
        Name name = null;
        Student student = new Student.Builder().buildStudentId("g7770").builddEmail("gmail.com").buildName(name).Build();
        name = new Name.Builder().buildName("Lola").buildSurname("Pierre").buildMiddleName("Lee").Build();

        System.out.println(country.toString());
        System.out.println(city.toString());
        System.out.println(address.toString());
        System.out.println(employeeAddress.toString());
        System.out.println(employee.toString());
        System.out.println(studentAddress.toString());
        System.out.println(student.toString());
        System.out.println(name.toString());

    }
}
