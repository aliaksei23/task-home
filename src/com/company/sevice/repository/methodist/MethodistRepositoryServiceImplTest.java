package com.company.sevice.repository.methodist;

import com.company.model.address.Address;
import com.company.model.persons.Methodist;
import com.company.repository.MethodistRepository;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MethodistRepositoryServiceImplTest {

    private Methodist methodist;
    private MethodistRepositoryService mrs;
    private MethodistRepository mr;

    @Before
    public void generateAttribute() {
        mrs = new MethodistRepositoryServiceImpl();
        mr = new MethodistRepository();
        mrs.inti(mr);
        methodist = new Methodist("", "", 34, "", 123456,
                new Address("", "", 12, 45));
    }

    @Test
    public void addMethodist() {
        mrs.addMethodist(methodist);
        assertNotNull(methodist);
        assertEquals(1,mr.getMethodists().size());
        assertEquals(methodist,mr.getMethodists().get(0));
    }

    @Test
    public void removeMethodist() {
        mrs.removeMethodist(methodist);
        assertNotNull(methodist);
        assertEquals(0,mr.getMethodists().size());
    }
}