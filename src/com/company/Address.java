package com.company;

import java.util.StringJoiner;

public class Address {

    private String city;
    private String street;
    private int houseNumber;
    private int flatNumber;

    public Address(String city, String street, int houseNumber, int flatNumber) {
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.flatNumber = flatNumber;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Address.class.getSimpleName() + "[", "]")
                .add("city='" + city + "'")
                .add("street='" + street + "'")
                .add("houseNumber=" + houseNumber)
                .add("flatNumber=" + flatNumber)
                .toString();
    }
}
