package com.company.model.persons;

import com.company.model.address.Address;
import com.company.Employee;

import java.util.StringJoiner;

public class Teacher extends Person implements Employee {

    private double teacherSalary;

    public Teacher(String name, String surname, int age, Address address, double teacherSalary) {
        super(name, surname, age, address);
        this.teacherSalary = teacherSalary;
    }

    public double getTeacherSalary() {
        return teacherSalary;
    }

    public void setTeacherSalary(double teacherSalary) {
        this.teacherSalary = teacherSalary;
    }

    public void changeSalary(double newSalary) {
        setTeacherSalary(newSalary);
    }

    @Override
    public double monthSalary() {
        return getTeacherSalary();
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Teacher.class.getSimpleName() + "[", "]")
                .add(getName())
                .add(getSurname())
                .add(String.valueOf(getAge()))
                .add(String.valueOf(getAddress()))
                .add("teacherSalary=" + teacherSalary)
                .toString();
    }
}
