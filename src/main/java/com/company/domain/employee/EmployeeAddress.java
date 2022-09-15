package com.company.domain.employee;

import com.company.domain.location.Address;

import java.util.Locale;

public class EmployeeAddress {
    private String staffId;
    private Address address;

    private EmployeeAddress(Builder builder){
        this.staffId = builder.staffId;
        this.address = builder.address;
    }

    public String getStaffId() {
        return staffId;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "   EmployeeAddress\n--------\n{" +
                "  staffId:'                  " + staffId + "\n" +
                ", address:                 " + address +
                '}';
    }
    public static class Builder{
        private String staffId;
        private Address address;

        public Builder buildStaffId(String staffId){
            this.staffId = staffId;
            return this;
        }
        public Builder buildAddress(Address address){
            this.address = address;
            return this;
        }
        public EmployeeAddress build(){
            return new EmployeeAddress(this);
        }
    }

}
