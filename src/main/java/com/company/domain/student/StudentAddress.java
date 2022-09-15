package com.company.domain.student;

import com.company.domain.location.Country;

public class StudentAddress {
    private String studentId;
    private String address;

    private StudentAddress(Builder builder){
        this.studentId = builder.studentId;
        this.address = builder.address;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "  StudentAddress\n-------------{" +
                " studentId:'                  " + studentId + "\n" +
                ",address:'                  " + address + "\n" +
                '}';
    }
    public static class Builder{
        private String studentId;
        private String address;

        public Builder buildStudentId(String studentId){
            this.studentId = studentId;
            return this;
        }
        public Builder buildAddress(String address){
            this.address = address;
            return this;
        }
        public StudentAddress build(){
            return new StudentAddress(this);

        }

    }
}
