package com.company.sevice.repository.teacher;

import com.company.model.address.Address;
import com.company.model.persons.Teacher;
import com.company.repository.TeacherRepository;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TeacherRepositoryServiceImplTest {

    private TeacherRepository tr;
    private TeacherRepositoryService trs;
    private Teacher teacher;

    @Before
    public void generateAttribute() {
        tr = new TeacherRepository();
        trs = new TeacherRepositoryServiceImpl();
        teacher = new Teacher("", "", 45, "",
                new Address("", "", 23, 45), 123456);
        trs.init(tr);
    }

    @Test
    public void addTeacher() {
        trs.addTeacher(teacher);
        assertNotNull(teacher);
        assertEquals(1, tr.getTeachers().size());
        assertEquals(teacher, tr.getTeachers().get(0));
    }

    @Test
    public void removeTeacher() {
        trs.removeTeacher(teacher);
        assertNotNull(teacher);
        assertEquals(0, tr.getTeachers().size());
    }

    @Test
    public void allTeacher() {
        List<Teacher> allTeacher = trs.allTeacher();
        assertEquals(allTeacher.size(), tr.getTeachers().size());
    }

    @Test
    public void pensionTeachers() {
        Teacher teacher1 = new Teacher("","",75,"male",
                new Address("","",78,23),0);
        trs.addTeacher(teacher1);
        List<Teacher> pensionTeachers = trs.pensionTeachers();

        assertEquals(1,pensionTeachers.size());
    }

    @Test
    public void salaryBiggerThan() {
        int salaryForCompare = 100000;
        trs.addTeacher(teacher);
        List<Teacher> salaryBiggerThan = trs.salaryBiggerThan(salaryForCompare);

        assertEquals(1,salaryBiggerThan.size());
        assertNotNull(salaryBiggerThan.get(0));
        assertTrue(salaryForCompare<=salaryBiggerThan.get(0).getSalaryPerYear());
    }
}