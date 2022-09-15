package com.company.repository.city.impl;

import com.company.domain.location.City;
import com.company.domain.location.Country;
import com.company.repository.Repository;
import com.company.repository.city.CityRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class CityRepositoryImpl implements CityRepository {
    private List<City> cityList;
    private static CityRepositoryImpl cityRepository = null;
    public static CityRepositoryImpl getCityRepository() {
        if (cityRepository == null){
            cityRepository = new CityRepositoryImpl();

    }
        return cityRepository;}

    public CityRepositoryImpl() {
        this.cityList = new ArrayList<>(); {

        }
    }
    @Override
    public City create(City city) {
        boolean result = cityList.add(city);
        if (city == null)
            if (result)

                return null;
        return city;
    }

    @Override
    public City read(String id) {
        return cityList.stream().filter(D -> D.getId().equals(id)).findAny().orElse( null);

    }

    @Override
    public City update(City city) {
        City city1 = read(city.getId());
        if (city1 != null){
            delete(city1);
            return create(city);
        }
        return null;
    }

    @Override
    public boolean delete(City city) {
        return cityList.remove(city);
    }
    @Override
    public Collection<City> readAll() {
        return cityList;
    }

    @Override
    public City readByName(String name) {
        return cityList.stream().filter(D -> D.getName().equals(name)).findAny().orElse( null);
    }
    @Override
    public List<City> readByCountry(Country country) {
        return cityList.stream().filter(D ->D.getCountry().equals(country)).collect(Collectors.toList());

    }
}
