package com.company.factory.location;

import com.company.domain.Name;
import com.company.domain.location.Country;
import org.junit.jupiter.api.Test;

import javax.xml.namespace.QName;

import static org.junit.jupiter.api.Assertions.*;

class CountyFactoryTest {
 @Test
    void getCounty(){
     //Name name = new Name.Builder().buildName("Kairo").buildMiddleName("Kai").buildSurname("Roro").Build();
     Country country = new Country.Builder().buildId("6438").buildName("Kairo").build();
     System.out.println(country);
 }

}