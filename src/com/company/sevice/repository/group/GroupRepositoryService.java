package com.company.sevice.repository.group;

import com.company.model.group.Group;
import com.company.repository.GroupRepository;

import java.util.List;

public interface GroupRepositoryService {

    void init (GroupRepository groupRepository);

    void add (Group group);

    void remove (Group group);

    List<Group> getGroupsByGraduationYears(int graduationYear1, int graduationYear2);
}
