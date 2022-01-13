package com.company.animal;

import java.util.StringJoiner;

public class Cat extends Animal {

    private String sound;

    public Cat(String food, String location) {
        super(food, location);
        sound = "Мяу";
    }

    @Override
    public void makeNoise() {
        System.out.println("Кот издает звык " + sound);
    }

    @Override
    public void eat() {
        System.out.println("Кот ест " +  super.getFood());
    }

    @Override
    public String toString() {
        return new StringJoiner( Dog.class.getSimpleName())
                .add("Cat")
                .toString();
    }
}
