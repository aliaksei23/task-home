package com.company.sevice.methodist;

import com.company.model.persons.Methodist;
import com.company.model.persons.Teacher;

public interface MethodistService {

    void init(Methodist methodist);

    void addTeacher(Teacher newTeacher);

    void removeTeacher(Teacher newTeacher);
}
