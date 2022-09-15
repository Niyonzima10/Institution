package com.company.factory.student;

import com.company.domain.Name;

public class NameFactory {

    public static Name getName(String name, String surname, String middleName) {
        return new Name.Builder().buildName("cici").buildSurname("Mandy").buildMiddleName("candy").Build();
    }
}
