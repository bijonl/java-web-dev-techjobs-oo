package Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    Job firstJob;
    Job secondJob;
    Job constructorTestJob;
    Job equalJob1;
    Job equalJob2;

    @Before
    public void createJobObjects() {
        firstJob = new Job();
        secondJob = new Job();
        constructorTestJob = new Job("Product tester",
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
    }

    @Test
    public void testSettingJobID(){
       assertEquals(1,secondJob.getId() - firstJob.getId(),0.0001);
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        // make sure everything is an instance of the class
        assertTrue(constructorTestJob != null);
        assertTrue(constructorTestJob.getEmployer() instanceof Employer);
        assertTrue(constructorTestJob.getLocation() instanceof Location);
        assertTrue(constructorTestJob.getPositionType() instanceof PositionType);
        assertTrue(constructorTestJob.getCoreCompetency() instanceof CoreCompetency);
        assertTrue(constructorTestJob.getEmployer() instanceof Employer);
        // make sure all the values are correct
        assertEquals(constructorTestJob.getName(),"Product tester");
        assertEquals(constructorTestJob.getEmployer().getValue(),"ACME");
        assertEquals(constructorTestJob.getLocation().getValue(),"Desert");
        assertEquals(constructorTestJob.getPositionType().getValue(),"Quality control");
        assertEquals(constructorTestJob.getCoreCompetency().getValue(),"Persistence");

    }

    @Test
    public void testJobsForEquality(){
        assertFalse(equalJob1 == equalJob2);
    }
}
