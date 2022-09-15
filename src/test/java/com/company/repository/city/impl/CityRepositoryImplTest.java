package com.company.repository.city.impl;

import com.company.domain.location.City;
import com.company.domain.location.Country;
import com.company.factory.location.CityFactory;
import com.company.factory.location.CountyFactory;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.PrimitiveIterator;

import static org.junit.jupiter.api.Assertions.*;

class CityRepositoryImplTest {
    private static CityRepositoryImpl REPOS = CityRepositoryImpl.getCityRepository();
    private static Country country = CountyFactory.getCountry("009762", "Egypt");
    private static City city = CityFactory.getCity("00875", "Cairo", country);

    @Test
    void getCityRepository() {
    }

    @Test
    void create() {
        City Create = REPOS.create(city);
        assertNotNull(Create);
        System.out.println(Create);
    }

    @Test
    void read() {
        String City = city.getId();
        City READ = REPOS.read(City);
        assertNotNull(City);
        System.out.println(City);
    }

    @Test
    void update() {
        String ID = String.valueOf(REPOS.update(city));
        City UPDATE = REPOS.update(city);
        assertNotNull(city);
        System.out.println(city);
    }

    @Test
    void delete() {
        String ID = city.getId();
        boolean DELETE = REPOS.delete(city);
        assertNotNull(city);
        System.out.println(city);
    }

    @Test
    void readAll() {
        String ID = city.getId();
        Collection<City> READALL = REPOS.readAll();
        System.out.println(city);
    }

    @Test
    void readByName() {
        String ID = city.getId();
        Collection<City> READBYNAME = (Collection<City>) REPOS.readByName(ID);
        System.out.println(city);
    }

    @Test
    void readByCountry() {
        String ID = city.getId();
        Collection<City> READBYCOUNTRY = REPOS.readByCountry(country);
        System.out.println(city);
    }
}