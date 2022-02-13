package com.company.sevice.repository.teacher;

import com.company.model.persons.Teacher;
import com.company.repository.TeacherRepository;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class TeacherRepositoryServiceImpl implements TeacherRepositoryService {

    private TeacherRepository teacherRepository;

    @Override
    public void init(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public void addTeacher(Teacher newTeacher) {
        teacherRepository.getTeachers().add(newTeacher);
    }

    @Override
    public void removeTeacher(Teacher newTeacher) {
        teacherRepository.getTeachers().remove(newTeacher);
    }

    @Override
    public List<Teacher> allTeacher() {
        return teacherRepository.getTeachers()
                .stream()
                .filter(t -> t != null)
                .collect(Collectors.toList());
    }

    @Override
    public List<Teacher> pensionTeachers() {
        return teacherRepository.getTeachers()
                .stream()
                .filter(Objects::nonNull)
                .filter(t -> (t.getGender().equalsIgnoreCase("female") && t.getAge() >= 57)
                        || t.getGender().equalsIgnoreCase("male") && t.getAge() >= 67)
                .collect(Collectors.toList());
    }

    @Override
    public List<Teacher> salaryBiggerThan(double salary) {
        return teacherRepository.getTeachers()
                .stream()
                .filter(Objects::nonNull)
                .filter(t -> (t.getGender().equalsIgnoreCase("female") && t.getAge() < 57)
                        || t.getGender().equalsIgnoreCase("male") && t.getAge() < 67)
                .filter(t -> t.getSalaryPerYear() >= salary)
                .collect(Collectors.toList());
    }
}
