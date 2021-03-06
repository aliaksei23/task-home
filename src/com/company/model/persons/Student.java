package com.company.model.persons;

import com.company.model.address.Address;
import com.company.model.base.Person;

import java.util.StringJoiner;

public class Student extends Person {

    public Student(String name, String surname, int age, String gender, Address address) {
        super(name, surname, age, gender, address);
    }

    public Student(String name, String surname, int age, String gender) {
        super(name, surname, age, gender);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Student.class.getSimpleName() + "[", "]")
                .add(getName())
                .add(getSurname())
                .add(String.valueOf(getAge()))
                .add(getGender())
                .add(String.valueOf(getAddress()))
                .toString();
    }
}
