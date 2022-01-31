package com.company.sevice.groupService;

import com.company.model.group.Group;
import com.company.model.persons.Student;
import com.company.model.persons.Teacher;

public class GroupServiceImpl implements GroupService {

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
