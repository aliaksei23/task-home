package com.company.persons;

import com.company.Address;

import java.util.StringJoiner;

public class Student extends Person {

    public Student(String name, String surname, int age, Address address) {
        super(name, surname, age, address);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Student.class.getSimpleName() + "[", "]")
                .add(getName())
                .add(getSurname())
                .add(String.valueOf(getAge()))
                .add(String.valueOf(getAddress()))
                .toString();
    }
}
