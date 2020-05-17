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

    @Before
    public void createJobObject() {
        testJob_1 = new Job();
        testJob_2 = new Job();
        testJob_3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        testJob_4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        testJob_5 = new Job("Product tester", new Employer(), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
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
//    testing toString method: when passed Job object, returns string w/blank line before and after job info
//    contains label for each field, each field own line
//    if field == "" add "Data not available" after label
//    BONUS: if Job object ONLY contains data for id field, should return "OOPS! This job does not seem to exist."
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

}
