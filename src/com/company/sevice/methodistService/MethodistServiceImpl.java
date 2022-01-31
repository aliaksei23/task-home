package com.company.sevice.methodistService;

import com.company.model.persons.Methodist;
import com.company.model.persons.Teacher;

public class MethodistServiceImpl implements MethodistService {

    private Methodist methodist;

    public void init(Methodist methodist) {
        this.methodist = methodist;
    }

    @Override
    public void addTeacher(Teacher newTeacher) {
        methodist.getTeacherList().add(newTeacher);
    }

    @Override
    public void removeTeacher(Teacher newTeacher) {
        methodist.getTeacherList().remove(newTeacher);
    }
}
