package com.company.sevice.group;

import com.company.model.group.Group;
import com.company.model.persons.Student;
import com.company.model.persons.Teacher;

import java.io.File;

public interface GroupService {

    void init (Group group);

    Teacher changeTeacher(Teacher newTeacher);

    void addStudentToGroup(Student student);

    void removeStudentFromGroup(Student student);

    void addStudentFromFile(File file);
}
