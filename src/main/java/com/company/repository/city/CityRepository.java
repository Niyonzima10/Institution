package com.company.repository.city;

import com.company.domain.Name;
import com.company.domain.location.City;
import com.company.domain.location.Country;
import com.company.repository.Repository;

import java.util.List;

public interface CityRepository extends Repository<City, String> {
    City readByName(String name );
    List<City> readByCountry(Country country);


}
