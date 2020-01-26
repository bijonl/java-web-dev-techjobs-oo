package Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    Job firstJob;
    Job secondJob;
    Job testJob;
    Job equalJob1;
    Job equalJob2;
    Job noData;

    @Before
    public void createJobObjects() {
        firstJob = new Job();
        secondJob = new Job();
        testJob = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        equalJob1 = new Job("Developer",
                new Employer("Company"),
                new Location("Anywhere"),
                new PositionType("High-Paying"),
                new CoreCompetency("Coding"));
        equalJob2 = new Job("Developer",
                new Employer("Company"),
                new Location("Anywhere"),
                new PositionType("High-Paying"),
                new CoreCompetency("Coding"));
        noData = new Job();
    }

    @Test
    public void testSettingJobID(){
       assertEquals(1,secondJob.getId() - firstJob.getId(),0.0001);
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        // make sure everything is an instance of the class
        assertTrue(testJob != null);
        assertTrue(testJob.getEmployer() instanceof Employer);
        assertTrue(testJob.getLocation() instanceof Location);
        assertTrue(testJob.getPositionType() instanceof PositionType);
        assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);
        assertTrue(testJob.getEmployer() instanceof Employer);
        // make sure all the values are correct
        assertEquals(testJob.getName(),"Product tester");
        assertEquals(testJob.getEmployer().getValue(),"ACME");
        assertEquals(testJob.getLocation().getValue(),"Desert");
        assertEquals(testJob.getPositionType().getValue(),"Quality control");
        assertEquals(testJob.getCoreCompetency().getValue(),"Persistence");

    }

    @Test
    public void testJobsForEquality(){
        assertFalse(equalJob1 == equalJob2);
    }

    @Test public void testJobToStringNewLine(){
        assertEquals("\nID: " + testJob.getId() + "\nName: " + testJob.getName() +
                "\nEmployer: " + testJob.getEmployer() + "\nLocation: " + testJob.getLocation() + "\nPosition Type: " +
                testJob.getPositionType() + "\nCore Competency: " + testJob.getCoreCompetency() + "\n", testJob.toString());
    }

    @Test public void testStingDataNotAvail(){
        assertEquals("\nID: " + noData.getId() + "\nName: " + "Data Not Available" +
                "\nEmployer: " + "Data Not Available" + "\nLocation: " + "Data Not Available" + "\nPosition Type: " +
                "Data Not Available" + "\nCore Competency: "+ "Data Not Available" + "\n", noData.toString());
    }



}
