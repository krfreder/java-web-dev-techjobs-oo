package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;


public class JobTest {
    Job testJob_1;
    Job testJob_2;
    Job testJob_3;
    Job testJob_4;

    @Before
    public void createJobObject() {
        testJob_1 = new Job();
        testJob_2 = new Job();
        testJob_3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        testJob_4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

//    @Test
//    public void emptyTest() {
//        assertEquals(10, 10, .001);
//    }

    @Test
    public void testSettingJobId() {
        assertTrue((testJob_1.getId() == 1) && (testJob_2.getId() == 2));
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertTrue(testJob_3.getEmployer() instanceof Employer);
        assertTrue(testJob_3.getLocation() instanceof Location);
        assertTrue(testJob_3.getPositionType() instanceof PositionType);
        assertTrue(testJob_3.getCoreCompetency() instanceof CoreCompetency);
        assertTrue(testJob_3.getName() == "Product tester");
        assertTrue(testJob_3.getEmployer().getValue() == "ACME");
        assertTrue(testJob_3.getLocation().getValue() == "Desert");
        assertTrue(testJob_3.getPositionType().getValue() == "Quality control");
        assertTrue(testJob_3.getCoreCompetency().getValue() == "Persistence");
    }

    @Test
    public void testJobsForEquality() {
        assertFalse(testJob_3 == testJob_4);
    }
}
