package com.company.professions;

import java.util.StringJoiner;

public class Driver extends Person {

    private double experience;

    public Driver(String firstName, String lastName, double experience) {
        super(firstName, lastName);
        this.experience = experience;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Driver.class.getSimpleName() + "[", "]")
                .add("first name=' " + firstName+ "'")
                .add("last name=' " + lastName+ "'")
                .add("experience=" + experience)
                .toString();
    }

}
