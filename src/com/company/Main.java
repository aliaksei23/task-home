package com.company;

import com.company.animal.Animal;
import com.company.animal.Cat;
import com.company.animal.Dog;
import com.company.animal.Horse;
import com.company.person.Vet;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Dog("мясо", "дом");
        Animal cat = new Cat("корм", "квартира");
        Animal horse = new Horse("сено", "конюшня");
        Animal[] animals = new Animal[]{dog, cat, horse};

        Vet vet = new Vet();

        for(Animal animal : animals) {
            vet.treatAnimal(animal);
        }
    }
}
