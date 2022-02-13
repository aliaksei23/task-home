package com.company;

import com.company.model.address.Address;
import com.company.model.group.Group;
import com.company.model.persons.Methodist;
import com.company.model.persons.Student;
import com.company.model.persons.Teacher;
import com.company.repository.base.Repository;
import com.company.repository.GroupRepository;
import com.company.repository.MethodistRepository;
import com.company.repository.TeacherRepository;
import com.company.sevice.group.GroupServiceImpl;
import com.company.sevice.group.GroupService;
import com.company.sevice.repository.teacher.TeacherRepositoryService;
import com.company.sevice.repository.teacher.TeacherRepositoryServiceImpl;
import com.company.util.ConvertUtil;
import com.company.util.SortUtil;

import java.io.File;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Tolik1", "Seriozn1", 18, "male",
                new Address("Grodno1", "Ojesko1", 11, 11));
        Student student2 = new Student("Tolik2", "Seriozn2", 19, "male",
                new Address("Grodno2", "Ojesko2", 12, 12));
        Student student3 = new Student("Vasili1", "Veseli1", 20, "male",
                new Address("Grodno3", "Ojesko3", 13, 13));
        Student student4 = new Student("Vasili2", "Veseli2", 21, "male",
                new Address("Grodno4", "Ojesko4", 14, 14));
        Student student5 = new Student("Vasili3", "Veseli3", 17, "male",
                new Address("Grodno5", "Ojesko5", 15, 15));

        Teacher teacher1 = new Teacher("Mari", "Spiridonova", 34, "female",
                new Address("Grodno", "Limoj", 24, 30), 1200007);

        Teacher teacher2 = new Teacher("Anna", "Natali", 34, "female",
                new Address("Minsk", "Mir", 19, 85), 1500000);

        Group group1 = new Group("Toliki", 3, 2019, 2023, teacher1);
        Group group2 = new Group("Vasili", 4, 2018, 2022, teacher2);

        GroupService groupServise = new GroupServiceImpl();
        groupServise.init(group1);
        groupServise.addStudentFromFile(new File("StudentList.txt"));

        groupServise.init(group2);
        groupServise.addStudentToGroup(student4);
        groupServise.addStudentToGroup(student5);
        groupServise.addStudentToGroup(student3);

        System.out.println(group1.getStudentList());
        System.out.println(group2.getStudentList());
        Teacher newTeacher = new Teacher("Ann", "Spiridonova", 21, "female",
                new Address("Minsk", "Mira", 24, 24), 150000);
        //        groupServise.changeTeacher(newTeacher);
        //        System.out.println(group1.getTeacher());
        //
        //
        //        MethodistService methodist = new MethodistServiceImpl();
        //        ((MethodistServiceImpl) methodist).init(methodist1);
        //        System.out.println(methodist1);

        Methodist methodist = ConvertUtil.teacherConverter.convert(teacher1);

        TeacherRepository teacherRepository = new TeacherRepository();
        MethodistRepository methodistRepository = new MethodistRepository();
        GroupRepository groupRepository = new GroupRepository();
        Repository repository = new Repository(teacherRepository, methodistRepository, groupRepository);

        TeacherRepositoryService teacherService = new TeacherRepositoryServiceImpl();
        teacherService.init(teacherRepository);

        teacherService.addTeacher(teacher1);
        System.out.println(repository.getTeacherRepository().getTeachers());

        System.out.println(SortUtil.sortByName(group2.getStudentList()));
    }
}
