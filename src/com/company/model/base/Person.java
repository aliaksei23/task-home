package com.company.model.base;

import com.company.model.address.Address;

import java.util.StringJoiner;

public abstract class Person {

    private String name;
    private String surname;
    private int age;
    private String gender;
    private Address address;

    public Person(String name, String surname, int age, String gender, Address address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender=gender;
        this.address = address;
    }

    public Person(String name, String surname, int age, String gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return new StringJoiner(", ", Person.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("surname='" + surname + "'")
                .add("age=" + age)
                .add("gender='" + gender + "'")
                .add("address=" + address)
                .toString();
    }
}
