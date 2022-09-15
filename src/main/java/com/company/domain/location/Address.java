package com.company.domain.location;

import com.company.domain.employee.EmployeeAddress;

public class Address {
    private String unitNumber;
    private String complexName;
    private int streetNumber;
    private String streetName;
    private int postalCode;
    private City city;

    private Address(Builder builder){
        this.city = builder.city;
        this.complexName = builder.complexName;
        this.streetName = builder.streetName;
        this.streetNumber = builder.streetNumber;
        this.postalCode = builder.postalCode;
        this.unitNumber = builder.unitNumber;
    }

    public String getUnitNumber() {
        return unitNumber;
    }

    public String getComplexName() {
        return complexName;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public City getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "    Address\n----------\n{" +
                "   unitNumber:'         " + unitNumber + "\n" +
                ",  complexName:'      " + complexName + "\n" +
                ",  streetNumber:      " + streetNumber +
                ",  streetName:'       " + streetName + "\n" +
                ",  postalCode:        " + postalCode +
                ",  city=" + city +
                '}';
    }
    public static class Builder{
        private String unitNumber;
        private String complexName;
        private int streetNumber;
        private String streetName;
        private int postalCode;
        private City city;

        public Builder buildUnitNumber(String unitNumber){
            this.unitNumber = unitNumber;
            return this;
        }
        public Builder buildComplexName(String complexName){
            this.complexName = complexName;
            return this;
        }
        public Builder buildStreetNumber(int streetNumber){
            this .streetNumber = streetNumber;
            return this;
        }
        public Builder buildStreetName(String streetName){
            this.streetName = streetName;
            return this;
        }
        public Builder buildPostalCode(int postalCode){
            this.postalCode = postalCode;
            return this;
        }
        public Builder buildCity(City city){
            this.city = city;
            return this;
        }
        public Address build(){
            return new Address(this);
        }
    }
}
