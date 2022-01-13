package com.company.details;

import java.util.StringJoiner;

public class Engine {

    private int hoursPower;
    private String producer;

    public Engine(int hoursPower, String producer) {
        this.hoursPower = hoursPower;
        this.producer = producer;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Engine.class.getSimpleName() + "[", "]")
                .add("hoursPower=" + hoursPower)
                .add("producer='" + producer + "'")
                .toString();
    }
}

