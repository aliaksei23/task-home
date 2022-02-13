package com.company.model.persons;

import com.company.exaption.SalaryException;
import com.company.model.base.Employee;
import com.company.model.address.Address;
import com.company.model.base.Person;

import java.util.ArrayList;
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
        this.teacherList = new ArrayList<>();

    }
    public double getSalaryPerYear() {
        return salaryPerYear;
    }

    public void setSalaryPerYear(double salaryPerYear)  {
        if(salaryPerYear< 120000) {
            try {
                throw new SalaryException("Min salary per year 120000");
            } catch(SalaryException e) {
                e.printStackTrace();
            }
        }
        this.salaryPerYear = salaryPerYear;
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
