package com.company.repository.base;

import com.company.repository.GroupRepository;
import com.company.repository.MethodistRepository;
import com.company.repository.TeacherRepository;

public class Repository {

    private TeacherRepository teacherRepository;
    private MethodistRepository methodistRepository;
    private GroupRepository groupRepository;

    public Repository(TeacherRepository teacherRepository,
            MethodistRepository methodistRepository, GroupRepository groupRepository) {
        this.teacherRepository = teacherRepository;
        this.methodistRepository = methodistRepository;
        this.groupRepository = groupRepository;
    }

    public TeacherRepository getTeacherRepository() {
        return teacherRepository;
    }

    public MethodistRepository getMethodistRepository() {
        return methodistRepository;
    }

    public GroupRepository getGroupRepository() {
        return groupRepository;
    }
}
