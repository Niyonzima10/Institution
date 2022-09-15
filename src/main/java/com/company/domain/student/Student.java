package com.company.domain.student;

import com.company.domain.Name;

public class Student {
    private String studentId;
    private String email;
    private Name name;

    private Student(Builder builder){
        this.studentId = builder.studentId;
        this.email = builder.email;
        this.name = builder.name;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getEmail() {
        return email;
    }

    public Name getName() {
        return name;
    }

    @Override
    public String toString() {
        return "  Student\n------------{" +
                " studentId:'          " + studentId + "\n" +
                ",email:'            " + email + "\n" +
                ",name:              " + name +
                '}';
    }
    public static class Builder{
        private String studentId;
        private String email;
        private Name name;

        public Builder buildStudentId(String studentId){
            this.studentId = studentId;
            return this;
        }
        public Builder builddEmail(String email){
            this.email = email;
            return this;
        }
        public Builder buildName(Name name){
            this.name = name;
            return this;
        }
        public Student Build(){
            return new Student(this);
        }
    }
}
