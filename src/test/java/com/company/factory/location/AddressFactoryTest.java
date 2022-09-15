package com.company.factory.location;

import com.company.domain.location.Address;
import com.company.domain.location.City;
import com.company.domain.location.Country;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddressFactoryTest {

    @Test
    void getAddress() {
        Country country = new Country.Builder().buildId("98624").buildName("Burundi").build();
        City city = new City.Builder().buildId("2564").buildName("Pretoria").buildCountry(country).build();
        Address address = AddressFactory.getAddress("A15","10 terrace road","terrace",88,7704,city);
        System.out.println(address);
    }
}