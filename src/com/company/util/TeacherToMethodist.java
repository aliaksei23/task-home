package com.company.util;

import com.company.model.persons.Methodist;
import com.company.model.persons.Teacher;

public class TeacherToMethodist implements Converter<Methodist,Teacher> {

    @Override
    public Methodist convert(Teacher t) {
        Converter<Methodist,Teacher> teacherConverter = tm -> new Methodist(t.getName()
                , t.getSurname()
                , t.getAge()
                , t.getGender()
                , t.getSalaryPerYear()
                , t.getAddress());
        return teacherConverter.convert(t);
    }
}
