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
    Job testJob_5;
    Job testJob_6;

    @Before
    public void createJobObject() {
        testJob_1 = new Job();
        testJob_2 = new Job();
        testJob_3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        testJob_4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        testJob_5 = new Job("Product tester", new Employer(), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        testJob_6 = new Job("", new Employer(), new Location(), new PositionType(), new CoreCompetency());
    }

//    @Test
//    public void emptyTest() {
//        assertEquals(10, 10, .001);
//    }

//    testing Job object
    @Test
    public void testSettingJobId() {
        assertTrue((testJob_1.getId() == 1) && (testJob_2.getId() == 2));
    }
//
    @Test
    public void testJobConstructorSetsAllFields() {
        assertTrue(testJob_3.getEmployer() instanceof Employer);
        assertTrue(testJob_3.getLocation() instanceof Location);
        assertTrue(testJob_3.getPositionType() instanceof PositionType);
        assertTrue(testJob_3.getCoreCompetency() instanceof CoreCompetency);
        assertSame("Product tester", testJob_3.getName());
        assertSame("ACME", testJob_3.getEmployer().getValue());
        assertSame("Desert", testJob_3.getLocation().getValue());
        assertSame("Quality control", testJob_3.getPositionType().getValue());
        assertSame("Persistence", testJob_3.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        assertNotSame(testJob_3, testJob_4);
    }

    @Test
    public void testToStringReturnsStringSandwichedWithBlankLine() {
        assertTrue(testJob_3.toString().startsWith("\n"));
        assertTrue(testJob_3.toString().endsWith("\n"));
    }

    @Test
    public void testToStringReturnsLabelWithData() {
        assertTrue(testJob_3.toString().contains("ID: 3"));
        assertTrue(testJob_3.toString().contains("Name: Product tester"));
        assertTrue(testJob_3.toString().contains("Employer: ACME"));
        assertTrue(testJob_3.toString().contains("Location: Desert"));
        assertTrue(testJob_3.toString().contains("Position Type: Quality control"));
        assertTrue(testJob_3.toString().contains("Core Competency: Persistence"));
    }

    @Test
    public void testEmptyFieldReturnsErrorMessage() {
        assertTrue(testJob_5.toString().contains("Data not available"));
    }

//    BONUS: if Job object ONLY contains data for id field, should return "OOPS! This job does not seem to exist."
//    @Test
//    public void testAllFieldsEmptyButIdReturnsErrorMessage() {
//        assertEquals(true, testJob_6.toString().contains("OOPS! This job does not seem to exist."));
//    }

}
