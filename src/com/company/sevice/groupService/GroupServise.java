package com.company.sevice.groupService;

import com.company.model.persons.Student;
import com.company.model.persons.Teacher;

public interface GroupServise {

    Teacher changeTeacher(Teacher newTeacher);

    void addStudentToGroup(Student student);

    void removeStudentFromGroup(Student student);
}
