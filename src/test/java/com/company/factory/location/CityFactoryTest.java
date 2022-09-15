package com.company.factory.location;

import com.company.domain.location.City;
import com.company.domain.location.Country;
import org.junit.jupiter.api.Test;

class CityFactoryTest {
 @Test
    void getCity(){
        Country country = new Country.Builder().buildId("3425").buildName("Tanzania").build();
        City city = new City.Builder().buildId("9631").buildName("Arusha").buildCountry(country).build();
        System.out.println(city);
    }

}