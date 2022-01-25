package com.company.group.servises;

import com.company.persons.Student;
import com.company.persons.Teacher;

import java.util.List;

public interface GroupServise {

    Teacher changeTeacher(Teacher newTeacher);

    void addStudentToGroup(Student student);

    void removeStudentFromGroup(Student student);
}
