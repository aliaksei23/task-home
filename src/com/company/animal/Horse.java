package com.company.animal;

import java.util.StringJoiner;

public class Horse extends Animal {

    private String sound;

    public Horse(String food, String location) {
        super(food, location);
        sound = "Прр";
    }

    @Override
    public void makeNoise() {
        System.out.println("Конь издает звык " + sound);
    }

    @Override
    public void eat() {
        System.out.println("Конь ест " +  super.getFood());
    }

    @Override
    public String toString() {
        return new StringJoiner( Dog.class.getSimpleName())
                .add("Horse")
                .toString();
    }
}
