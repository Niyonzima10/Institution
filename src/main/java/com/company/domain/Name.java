package com.company.domain;

public class Name {
    public String getName;
    private String name;
    private String surname;
    private String middleName;

    private Name(Builder builder){
        this.name = builder.name;
        this.middleName = builder.middleName;
        this.surname = builder.surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getMiddleName() {
        return middleName;
    }

    @Override
    public String toString() {
        return "  Name\n-----------\n{" +
                " name='              " + name + "\n" +
                ",surname='           " + surname + "\n" +
                ",middleName='        " + middleName + "\n" +
                '}';
    }
    public static class Builder{
        private String name;
        private String surname;
        private String middleName;

        public Builder buildName(String name){
            this.name = name;
            return this;
        }
        public Builder buildSurname(String surname){
            this.surname = surname;
            return this;
        }
        public Builder buildMiddleName(String middleName){
            this.middleName = middleName;
            return this;
        }
        public Name Build(){
            return new Name(this);
        }
    }
}
