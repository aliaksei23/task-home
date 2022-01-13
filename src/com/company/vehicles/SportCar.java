package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends  Car {

    private double maxSpeed;

    public SportCar(String brand,
            String carClass,
            double weight,
            Driver driver,
            Engine engine,
            double maxSpeed) {
        super(brand, carClass, weight, driver, engine);
        this.maxSpeed = maxSpeed;
    }

}
