package com.company.domain.location;

import com.company.domain.employee.Employee;

public class Country {
    private String id;
    private String name;

    private Country(Builder builder){
       this.id = builder.id;
       this.name = builder.name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "  Country\n----------{" +
                " id:'               " + id + "\n" +
                ",name:'           " + name + "\n" +
                '}';
    }
    public static class Builder{
        private String id;
        private String name;

        public Builder buildId(String id){
            this.id = id;
            return this;
        }
        public Builder buildName(String name){
            this.name = name;
            return this;
        }
        public Country build(){
            return new Country(this);
        }
    }
}
