package com.company.model.persons;

import com.company.model.address.Address;
import com.company.Employee;

import java.util.StringJoiner;

public class Teacher extends Person implements Employee {

    private double salaryPerYear;

    public Teacher(String name, String surname, int age, String gender, Address address, double salaryPerYear) {
        super(name, surname, age, gender, address);
        setSalaryPerYear(salaryPerYear);
        //        this.salaryPerYear = salaryPerYear;
    }

    public double getSalaryPerYear() {
        return salaryPerYear;
    }

    public void setSalaryPerYear(double salaryPerYear) {
        if(salaryPerYear >= 100000) {
            this.salaryPerYear = salaryPerYear;
        } else {
            System.out.println("minimal salary per year should be 100000");
        }
    }

    public void changeSalary(double newSalary) {
        setSalaryPerYear(newSalary);
    }

    @Override
    public double monthSalary() {
        return getSalaryPerYear() / 12;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Teacher.class.getSimpleName() + "[", "]")
                .add(getName())
                .add(getSurname())
                .add(String.valueOf(getAge()))
                .add(getGender())
                .add(String.valueOf(getAddress()))
                .add("Salary=" + salaryPerYear)
                .toString();
    }
}