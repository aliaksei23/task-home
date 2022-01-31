package com.company.sevice.workersService;

import com.company.model.employee.WorkersRepository;
import com.company.model.group.Group;
import com.company.model.persons.Teacher;

import java.util.List;
import java.util.stream.Collectors;

public class WorkersServiceImpl implements WorkersService {

    private WorkersRepository workersRepository;

    public void init(WorkersRepository workersRepository) {
        this.workersRepository = workersRepository;
    }

    @Override
    public List<Teacher> allTeacher() {
        return workersRepository.getEmpList()
                .stream()
                .filter(t -> t instanceof Teacher)
                .map(t -> (Teacher) t)
                .collect(Collectors.toList());
    }

    @Override
    public List<Teacher> pensionTeachers() {
        return workersRepository.getEmpList()
                .stream()
                .filter(t -> t instanceof Teacher)
                .map(t -> (Teacher) t)
                .filter(t -> (t.getGender().equalsIgnoreCase("female") && t.getAge() >= 57)
                        || t.getGender().equalsIgnoreCase("male") && t.getAge() >= 67)
                .collect(Collectors.toList());
    }

    @Override
    public List<Teacher> salaryBiggerThan(double salary) {
        return workersRepository.getEmpList()
                .stream()
                .filter(t -> t instanceof Teacher)
                .map(t -> (Teacher) t)
                .filter(t -> (t.getGender().equalsIgnoreCase("female") && t.getAge() < 57)
                        || t.getGender().equalsIgnoreCase("male") && t.getAge() < 67)
                .filter(t -> t.getSalaryPerYear() >= salary)
                .collect(Collectors.toList());
    }

    @Override
    public List<Group> groupsByGraduationYears(int graduationYear1, int graduationYear2) {
        return workersRepository.getGroupList()
                .stream()
                .filter(g -> g.getYearOfEnding() >= graduationYear1 && g.getYearOfEnding() <= graduationYear2)
                .collect(Collectors.toList());
    }
}
