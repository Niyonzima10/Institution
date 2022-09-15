package com.company.domain.location;

public class City {
    private String id;
    private String name;
    private Country country;

    private City(Builder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.country = builder.country;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Country getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "  City\n------\n{" +
                " id:'          " + id + "\n" +
                ",name:'      " + name + "\n" +
                ",country:    " + country +
                '}';
    }
    public static class Builder{
        private String id;
        private String name;
        private Country country;

        public Builder buildId(String id){
            this.id = id;
            return this;
        }
        public Builder buildName(String name){
            this.name = name;
            return this;
        }
        public Builder buildCountry(Country county){
            this.country = county;
            return this;
        }
        public City build(){
            return new City(this);
        }
    }
}
