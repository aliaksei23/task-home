package com.company.repository;

import com.company.model.group.Group;

import java.util.ArrayList;
import java.util.List;

public class GroupRepository {

    private List<Group> groups;

    public GroupRepository() {
        this.groups = new ArrayList<>();
    }

    public List<Group> getGroups() {
        return groups;
    }
}
