package com.company.sevice.methodist;

import com.company.model.address.Address;
import com.company.model.persons.Methodist;
import com.company.model.persons.Teacher;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class MethodistServiceImplTest {
    private MethodistService ms;
    private Teacher teacher;
    private Methodist methodist;

    @Before
    public void generateAttribute() {

        methodist = new Methodist("", "", 45, "", 148564,
                new Address("", "", 58, 45));

        ms = new MethodistServiceImpl();

        teacher = new Teacher("Ann", "Marry", 25, "female",
                new Address("Grodno", "Mir", 49, 18), 120000);

        ms.init(methodist);
    }

    @Test
    public void addTeacher() {
        ms.addTeacher(teacher);
        assertEquals(1,methodist.getTeacherList().size());
        assertEquals(teacher,methodist.getTeacherList().get(0));
        assertNotNull(teacher);
    }

    @Test
    public void removeTeacher() {
        ms.removeTeacher(teacher);
        assertEquals(0,methodist.getTeacherList().size());
        assertNotNull(teacher);
    }
}