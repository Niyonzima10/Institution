package com.company.repository.country;

import com.company.domain.location.Country;
import com.company.repository.Repository;

public interface CountryRepository extends Repository<Country, String> {
    Country readByName(String name);
}
