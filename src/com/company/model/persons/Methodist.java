package com.company.model.persons;

import com.company.Employee;
import com.company.model.address.Address;

import java.util.List;
import java.util.StringJoiner;

public class Methodist extends Person implements Employee {

    private List<Teacher> teacherList;
    private double salaryPerYear;

    public Methodist(String name,
            String surname,
            int age,
            String gender, double salaryPerYear,
            Address address) {
        super(name, surname, age, gender, address);
        setSalaryPerYear(salaryPerYear);
//        this.salaryPerYear = salaryPerYear;
    }
    public double getSalaryPerYear() {
        return salaryPerYear;
    }

    public void setSalaryPerYear(double salaryPerYear) {
        if(salaryPerYear >= 120000) {
            this.salaryPerYear = salaryPerYear;
        } else {
            System.out.println("minimal salary per year should be 100000");
        }
    }
    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    @Override
    public double monthSalary() {
        return getSalaryPerYear()/12;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Methodist.class.getSimpleName() + "[", "]")
                .add(getName())
                .add(getSurname())
                .add(String.valueOf(getAge()))
                .add(String.valueOf(getAddress()))
                .toString();
    }


}
