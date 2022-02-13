package com.company.repository;

import com.company.model.persons.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherRepository {

    private List<Teacher> teachers;

    public TeacherRepository() {
        this.teachers = new ArrayList<>();
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

}
