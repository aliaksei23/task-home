package com.company.model.group;

import com.company.model.persons.Student;
import com.company.model.persons.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Group {

    private String groupName;
    private int course;
    private int yearOfAdmission;
    private int yearOfEnding;
    private List<Student> studentList;
    private Teacher teacher;

    public Group(String groupName, int course, int yearOfAdmission, int yearOfEnding, Teacher teacher) {
        this.groupName = groupName;
        this.course = course;
        this.yearOfAdmission = yearOfAdmission;
        this.yearOfEnding = yearOfEnding;
        this.studentList = new ArrayList<>();
        this.teacher = teacher;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public int getYearOfAdmission() {
        return yearOfAdmission;
    }

    public int getYearOfEnding() {
        return yearOfEnding;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Group.class.getSimpleName() + "[", "]")
                .add("groupName='" + groupName + "'")
                .add("course=" + course)
                .add("studentList=" + studentList)
                .add("teacher=" + teacher)
                .toString();
    }
}
