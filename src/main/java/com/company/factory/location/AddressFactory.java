package com.company.factory.location;

import com.company.domain.location.Address;
import com.company.domain.location.City;
import com.company.domain.student.StudentAddress;

public class AddressFactory {


    public static Address getAddress(String unitNumber, String complexName, String streetName,int streetNumber, int postalCode,City city){
     return new Address.Builder().buildUnitNumber(unitNumber).buildComplexName(complexName).buildStreetName(streetName).buildStreetNumber(streetNumber).buildPostalCode(postalCode).buildCity(city).build();
    }
}
