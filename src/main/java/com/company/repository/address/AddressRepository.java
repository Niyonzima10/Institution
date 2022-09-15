package com.company.repository.address;

import com.company.domain.location.Address;
import com.company.domain.location.City;
import com.company.repository.Repository;

import java.util.List;

public interface AddressRepository extends Repository<Address, String>{
    Address readByStreetName( String streetName);
    List<Address> readByCity(City city);

}
