package com.company.sevice.repository.teacher;

import com.company.model.persons.Teacher;
import com.company.repository.TeacherRepository;

import java.util.List;

public interface TeacherRepositoryService {

    void init(TeacherRepository teacherRepository);

    void addTeacher(Teacher newTeacher);

    void removeTeacher(Teacher newTeacher);

    List<Teacher> allTeacher();

    List<Teacher> pensionTeachers();

    List<Teacher> salaryBiggerThan(double salary);


}
