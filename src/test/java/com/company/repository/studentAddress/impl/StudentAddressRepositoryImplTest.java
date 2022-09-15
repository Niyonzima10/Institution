package com.company.repository.studentAddress.impl;

import com.company.domain.location.Address;
import com.company.domain.location.City;
import com.company.domain.location.Country;
import com.company.domain.student.StudentAddress;
import com.company.factory.location.AddressFactory;
import com.company.factory.location.CityFactory;
import com.company.factory.location.CountyFactory;
import com.company.factory.student.StudentAddressFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class StudentAddressRepositoryImplTest {

    private static StudentAddressRepositoryImpl REPOS=StudentAddressRepositoryImpl.getStudentAddressRepository();

    private static   StudentAddress studentAddress  = StudentAddressFactory.getStudentAddress("hf234","33 koeburg");
    private static  Country country=CountyFactory.getCountry("2341","italy");
    private static City  city=CityFactory.getCity("2342","rome",country);
    private static  Address address = AddressFactory.getAddress("U17","Bezendisch","alice",12,1234,city);
    @Test
    void A_create() {
        StudentAddress Create = REPOS.create(studentAddress);
        assertNotNull(Create);
        System.out.println(Create);
    }
    @Test
    void B_read() {
        String ID = studentAddress.getStudentId();
        StudentAddress READ = REPOS.read(ID);
        assertNotNull(ID);
        System.out.println(ID);
    }
    @Test
    void C_update() {
        String ID = String.valueOf(REPOS.update(studentAddress));
        assertNotNull(ID);
        System.out.println(studentAddress);
    }
    @Test
    void D_delete() {
        String ID = studentAddress.getAddress();
        boolean DELETE = REPOS.delete(studentAddress);
        System.out.println(studentAddress);
    }
    @Test
    void E_readAll() {
        String ID = studentAddress.getAddress();
        Collection<StudentAddress> ReadALL = REPOS.readAll();
        System.out.println(studentAddress);
    }
    @Test
    void F_readByAddress() {
        String ID = String.valueOf(REPOS.readByAddress("ROSE ROAD 15"));
        System.out.println(studentAddress);
    }
    @Test
    void G_readByStudentAddress() {
        String ID = String.valueOf(REPOS.readByStudentAddress("234"));
        System.out.println(studentAddress);

    }
}