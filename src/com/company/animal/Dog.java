package com.company.animal;

import java.util.StringJoiner;

public class Dog extends Animal {

    private String sound;

    public Dog(String food, String location) {
        super(food, location);
        sound = "Гав";
    }

    @Override
    public void makeNoise() {
        System.out.println("Собака издает звык " + sound);
    }

    @Override
    public void eat() {
        System.out.println("Собака ест " + super.getFood());
    }

    @Override
    public String toString() {
        return new StringJoiner( Dog.class.getSimpleName())
                .add("Dog")
                .toString();
    }
}
