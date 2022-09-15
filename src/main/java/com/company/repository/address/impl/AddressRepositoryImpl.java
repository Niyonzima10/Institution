package com.company.repository.address.impl;

import com.company.domain.location.Address;
import com.company.domain.location.City;
import com.company.repository.address.AddressRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class AddressRepositoryImpl implements AddressRepository {
    private List<Address> addressList;
    private static AddressRepositoryImpl addressRepository = null;
    public static AddressRepositoryImpl getAddressRepository(){
        if(addressRepository == null){
            addressRepository = new AddressRepositoryImpl();
        }
            return addressRepository;
    }
    public AddressRepositoryImpl(){
        this.addressList = new ArrayList<>();

    }
    @Override
    public Address create(Address address) {
        boolean result = addressList.add(address);
        if(address == null);
        if(result);
        return address;
    }

    @Override
    public Address read(String id) {
        return addressList.stream().filter(D ->D.getStreetName().equals(id)).findAny().orElse(null);
    }

    @Override
    public Address update(Address address) {
        Address address1 = read(address.getStreetName());
        if(address1 != null){
            delete(address1);
            return create(address);
        }
        return null;
    }

    @Override
    public boolean delete(Address address) {
        return addressList.remove(address);
    }

    @Override
    public Collection<Address> readAll() {
        return addressList;
    }

    @Override
    public Address readByStreetName(String streetName) {
        return addressList.stream().filter(D ->D.getStreetName().equals(streetName)).findAny().orElse(null);
    }

    @Override
    public List<Address> readByCity(City city) {
        return addressList.stream().filter(D ->D.getCity().equals(city)).collect(Collectors.toList());
    }
}
