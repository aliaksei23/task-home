package com.company.person;

import com.company.animal.Animal;

public class Vet {

    public void treatAnimal(Animal animal) {
        System.out.println("На прием пришел " + animal + " он ест " + animal.getFood() + " и живет в " + animal
                .getLocation());
    }

}
