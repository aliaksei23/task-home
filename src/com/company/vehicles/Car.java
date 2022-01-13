package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

import java.util.StringJoiner;

public abstract class Car {

        private String brand;
        private String carClass;
        private double weight;
        private Driver driver;
        private Engine engine;

        public Car(String brand, String carClass, double weight, Driver driver, Engine engine) {
            this.brand = brand;
            this.carClass = carClass;
            this.weight = weight;
            this.driver = driver;
            this.engine = engine;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", Car.class.getSimpleName() + "[", "]")
                    .add("brand='" + brand + "'")
                    .add("carClass='" + carClass + "'")
                    .add("weight=" + weight)
                    .add("driver=" + driver)
                    .add("engine=" + engine)
                    .toString();
        }

        public void start() {
            System.out.println("Поехали");
        }

        public void stop() {
            System.out.println("Останавливаеся");
        }

        public void turnRight() {
            System.out.println("Поворот направо");
        }

        public void turnLeft() {
            System.out.println("Поворот налево");
        }

}
