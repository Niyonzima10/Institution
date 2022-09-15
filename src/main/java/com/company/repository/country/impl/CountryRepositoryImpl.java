package com.company.repository.country.impl;

import com.company.domain.location.Country;
import com.company.repository.country.CountryRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CountryRepositoryImpl implements CountryRepository {
    private List<Country> countryList;
    private static CountryRepositoryImpl countryRepository = null;
    public static CountryRepositoryImpl getCountryRepository(){
        if (countryRepository == null){
            countryRepository = new CountryRepositoryImpl();


        }
        return countryRepository;
    }
    public CountryRepositoryImpl(){
        this.countryList = new ArrayList<>();
    }
    @Override
    public Country create(Country country) {
        boolean result = countryList.add(country);
        if(country == null)
            if(result)
                return null;

        return country;
    }

    @Override
    public Country read(String id) {
        return countryList.stream().filter(D-> D.getName().equals(id)).findAny().orElse(null);

    }

    @Override
    public Country update(Country country) {
        Country country1 = read(country.getName());
        if (country1 != null) {
            delete(country1);
            return create(country);
        }
        return null;
    }
    @Override
    public boolean delete(Country country) {
        return countryList.remove(country);
    }

    @Override
    public Collection<Country> readAll() {
        return countryList;
    }

    @Override
    public Country readByName(String name) {
        return countryList.stream().filter(D ->D.getName().equals(name)).findAny().orElse(null);
    }
}
