package com.company.util;

import com.company.model.base.Person;
import com.company.model.persons.Methodist;
import com.company.model.persons.Teacher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ConvertUtil {

    public static Converter<Methodist,Teacher> teacherConverter = t -> {
        return new Methodist(t.getName()
                , t.getSurname()
                , t.getAge()
                , t.getGender()
                , t.getSalaryPerYear()
                , t.getAddress());
    };
}
