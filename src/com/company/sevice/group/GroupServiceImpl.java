package com.company.sevice.group;

import com.company.model.group.Group;
import com.company.model.persons.Student;
import com.company.model.persons.Teacher;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class GroupServiceImpl implements GroupService {

    private Group group;

    @Override
    public void init(Group group) {
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

    @Override
    public void addStudentFromFile(File file) {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {

            String line;
            while((line = bufferedReader.readLine()) != null) {
                addStudentToGroup(getStudentFromFile(line));
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    private Student getStudentFromFile(String string) {
        String[] strings = string.split(" ");
        String name = strings[0];
        String surname = strings[1];
        int age = Integer.parseInt(strings[2]);
        String gender = strings[3];
        return new Student(name, surname, age, gender);
    }
}
