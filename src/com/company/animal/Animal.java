package com.company.animal;

import java.util.StringJoiner;

public abstract class Animal {

    protected String food;
    protected String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public abstract void makeNoise();

    public abstract void eat();

    public void sleep(Animal animal) {
        System.out.println(animal + " спит");
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

}
