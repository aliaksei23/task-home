package com.company.sevice.group;

import com.company.model.address.Address;
import com.company.model.group.Group;
import com.company.model.persons.Student;
import com.company.model.persons.Teacher;
import org.hamcrest.Matcher;
import org.hamcrest.core.Is;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import static org.hamcrest.core.Is.*;
import static org.junit.Assert.*;

public class GroupServiceImplTest {
    GroupService groupService = new GroupServiceImpl();
    Group group1;

    @Before
    public void generateStudent() {

        Student student1 = new Student("Tolik1", "Seriozn1", 18, "male",
                new Address("Grodno1", "Ojesko1", 11, 11));
        Teacher teacher1 = new Teacher("Mari", "Spiridonova", 34, "female",
                new Address("Grodno", "Limoj", 24, 30), 120007);

        group1 = new Group("Toliki", 3, 2019, 2023, teacher1);

        groupService.init(group1);
        groupService.addStudentToGroup(student1);
    }

    @Test
    public void addStudentFromFile() {
        File file = new File("StudentList.txt");
        groupService.addStudentFromFile(file);

        assertEquals(6,group1.getStudentList().size());
    }

    @Test
    public void changeTeacher() {
        Teacher teacher2 = new Teacher("Arina", "Sidorova", 34, "female",
                new Address("Minsk", "Limoj", 24, 30), 120007);

        groupService.changeTeacher(teacher2);
        assertThat(group1.getTeacher(), is(teacher2));
    }

    @Test
    public void addStudentToGroup() {

        Student student1 = new Student("Tolik1", "Seriozn1", 18, "male",
                new Address("Grodno1", "Ojesko1", 11, 11));

        Teacher teacher1 = new Teacher("Mari", "Spiridonova", 34, "female",
                new Address("Grodno", "Limoj", 24, 30), 120007);

        Group group1 = new Group("Toliki", 3, 2019, 2023, teacher1);

        GroupService group = new GroupServiceImpl();
        group.init(group1);
        group.addStudentToGroup(student1);

        assertThat(group1.getStudentList().size(), is(1));
        assertNotNull(group1.getStudentList());
        assertEquals(1, group1.getStudentList().size());
        assertEquals(student1, group1.getStudentList().get(0));
    }

    @Test
    public void removeStudentFromGroup() {
        Student student1 = new Student("Tolik1", "Seriozn1", 18, "male",
                new Address("Grodno1", "Ojesko1", 11, 11));

        Teacher teacher1 = new Teacher("Mari", "Spiridonova", 34, "female",
                new Address("Grodno", "Limoj", 24, 30), 120007);

        Group group1 = new Group("Toliki", 3, 2019, 2023, teacher1);

        GroupService groupService = new GroupServiceImpl();
        groupService.init(group1);
        groupService.addStudentToGroup(student1);
        groupService.removeStudentFromGroup(student1);

        assertEquals(0, group1.getStudentList().size());
    }
}