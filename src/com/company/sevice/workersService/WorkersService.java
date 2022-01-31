package com.company.sevice.workersService;

import com.company.model.group.Group;
import com.company.model.persons.Teacher;

import java.util.List;

public interface WorkersService {

    public List<Teacher> allTeacher();

    public List<Teacher> pensionTeachers();

    public List<Teacher> salaryBiggerThan(double salary);

    public List<Group> groupsByGraduationYears(int graduationYear1, int graduationYear2);
}
