package com.company;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;
import com.company.vehicles.Lorry;

public class Test {

    public static void main(String[] args) {
        Driver driver = new Driver("Tolik", "Drivovich",5);
        Engine engine = new Engine(255,"KOS");
        Car car = new Lorry("MAN","Lorry",15,driver,engine,150);

        System.out.println(car);
    }

}
