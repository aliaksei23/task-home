package com.company.util;

import com.company.model.base.Person;

import java.util.Comparator;
import java.util.List;

public class SortUtil {

    public static List<? extends Person> sortByName(List<? extends Person> list) {
        list.sort(Comparator.comparing(Person::getName));
        return list;
    }
}
