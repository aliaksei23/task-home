package com.company.model.persons;

import com.company.exaption.SalaryException;
import com.company.model.address.Address;
import com.company.model.base.Employee;
import com.company.model.base.Person;
import com.company.repository.TeacherRepository;

import java.util.StringJoiner;

public class Teacher extends Person implements Employee {

    private double salaryPerYear;

    public Teacher(String name, String surname, int age, String gender, Address address, double salaryPerYear) {
        super(name, surname, age, gender, address);
        setSalaryPerYear(salaryPerYear);
    }

    public double getSalaryPerYear() {
        return salaryPerYear;
    }

    public void setSalaryPerYear(double salaryPerYear) {
        try {
            if((getAge() >= 57 && getGender().equalsIgnoreCase("female")) ||
                    (getAge() >= 67 && getGender().equalsIgnoreCase("male"))) {
                this.salaryPerYear = 0;
            } else if(salaryPerYear < 100000) {
                throw new SalaryException("Min salary per year 100000");
            }
            this.salaryPerYear = salaryPerYear;

        } catch(SalaryException e) {
            e.printStackTrace();
        }
    }

    public void changeSalary(double newSalary) throws SalaryException {
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
