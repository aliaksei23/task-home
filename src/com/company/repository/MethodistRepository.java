package com.company.repository;

import com.company.model.persons.Methodist;

import java.util.ArrayList;
import java.util.List;

public class MethodistRepository {

    private List<Methodist> methodists;

    public MethodistRepository() {
        this.methodists = new ArrayList<>();
    }

    public List<Methodist> getMethodists() {
        return methodists;
    }
}
