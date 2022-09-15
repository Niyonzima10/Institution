package com.company.factory.location;

import com.company.domain.location.City;
import com.company.domain.location.Country;

public class CityFactory {
    private String id;
    private String name;
    private Country country;

    public static City getCity(String id, String name, Country country){
        return new City.Builder().buildId(id).buildName(name).buildCountry(country).build();
    }
}
