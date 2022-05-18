package com.company.sevice.repository.group;

import com.company.model.group.Group;
import com.company.repository.GroupRepository;

import java.util.List;
import java.util.stream.Collectors;

public class GroupRepositoryImpl implements GroupRepositoryService {

    private GroupRepository groupRepository;

    @Override
    public void init(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    @Override
    public void add(Group group) {
        groupRepository.getGroups().add(group);
    }

    @Override
    public void remove(Group group) {
        groupRepository.getGroups().remove(group);
    }

    @Override
    public List<Group> getGroupsByGraduationYears(int graduationYear1, int graduationYear2) {
       return groupRepository.getGroups()
                .stream()
                .filter(g -> g.getYearOfEnding() >= graduationYear1 && g.getYearOfEnding() <= graduationYear2)
                .collect(Collectors.toList());
    }
}
