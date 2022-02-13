package com.company.sevice.repository.group;

import com.company.model.address.Address;
import com.company.model.group.Group;
import com.company.model.persons.Teacher;
import com.company.repository.GroupRepository;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GroupRepositoryImplTest {

    private Group group;
    private GroupRepositoryService grs;
    private GroupRepository gr;

    @Before
    public void generateAttribute() {
        group = new Group("", 1, 2018, 2022,
                new Teacher("", "", 34, "",
                        new Address("", "", 45, 48), 125888));
        grs = new GroupRepositoryImpl();
        gr = new GroupRepository();
        grs.init(gr);
    }

    @Test
    public void add() {
        grs.add(group);
        assertEquals(1, gr.getGroups().size());
        assertNotNull(gr.getGroups().get(0));
    }

    @Test
    public void remove() {
        grs.remove(group);
        assertEquals(0, gr.getGroups().size());
        assertNotNull(group);
    }

    @Test
    public void getGroupsByGraduationYears() {
        int start = 2018;
        int end = 2022;
        assertEquals(group, group);
    }
}