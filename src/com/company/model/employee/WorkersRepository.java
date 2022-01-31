package com.company.model.employee;

import com.company.Employee;
import com.company.model.group.Group;

import java.util.ArrayList;
import java.util.List;

public class WorkersRepository {

    private List<Employee> empList;
    private List<Group> groupList;

    public WorkersRepository() {
        this.empList = new ArrayList<>();
        this.groupList = new ArrayList<>();
    }

    public List<Employee> getEmpList() {
        return empList;
    }

    public List<Group> getGroupList() {
        return groupList;
    }
}
//empList.stream()
//        .filter(t -> t instanceof Teacher)
//        .map(t->(Teacher) t)
//        .sorted((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()))
//        .collect(Collectors.toList());