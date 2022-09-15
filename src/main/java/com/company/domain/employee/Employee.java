package com.company.domain.employee;

import com.company.domain.Name;

public class Employee {
    private String staffId;
    private Name name;
    private String email;

    private Employee(Builder builder){
    this.staffId = builder.staffId;
    this.name = builder.name;
    this.email = builder.email;
}

    public String getStaffId() {
        return staffId;
    }

    public Name getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "   Employee\n----\n{" +
                "  staffId:'       " + staffId + "\n" +
                ", name:'        " + name + "\n" +
                ", email:'       " + email + "\n" +
                '}';
    }
    public static class Builder{
        private String staffId;
        private Name name;
        private String email;

        public Builder buildStaffId(String staffId){
            this.staffId = staffId;
            return this;
        }
        public Builder buildName(Name name){
            this.name = name;
            return this;
        }
        public Builder buildEmail(String email){
            this.email = email;
            return this;
        }
        public Employee build(){
            return new Employee(this);
        }
}
}
