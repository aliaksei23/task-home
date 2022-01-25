package com.company.group.servises;

import com.company.group.Group;
import com.company.persons.Student;
import com.company.persons.Teacher;

public class GroupServiceImpl implements GroupServise{

    private Group group;

   public void init (Group group){
        this.group = group;
    }

    @Override
    public Teacher changeTeacher(Teacher newTeacher) {
        group.setTeacher(newTeacher);
        return newTeacher;
    }

    @Override
    public void addStudentToGroup(Student student) {
        group.getStudentList().add(student);
    }

    @Override
    public void removeStudentFromGroup(Student student) {
        group.getStudentList().remove(student);
    }
}
