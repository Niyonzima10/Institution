package com.company.factory.location;

import com.company.domain.location.Country;

public class CountyFactory {
    private String id;
    private String name;

     public static Country getCountry(String id, String name){
         return new Country.Builder().buildId(id).buildName(name).build();

     }
}
