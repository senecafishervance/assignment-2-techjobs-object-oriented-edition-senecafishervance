package org.launchcode.techjobs.oo.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import javax.print.DocFlavor;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId()
    {
        Job jobOne = new Job();
        Job jobTwo = new Job();
        Assert.assertNotEquals(jobOne.getId(),jobTwo.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        Assert.assertTrue(testJob instanceof Job);

        Assert.assertTrue(testJob.getName() == "Product tester");

        Assert.assertTrue(testJob.getEmployer() instanceof Employer);
        Assert.assertTrue(testJob.getEmployer().getValue() == "ACME");

        Assert.assertTrue(testJob.getLocation() instanceof Location);
        Assert.assertTrue(testJob.getLocation().getValue() == "Desert");

        Assert.assertTrue(testJob.getPositionType() instanceof PositionType);
        Assert.assertTrue(testJob.getPositionType().getValue() == "Quality control");

        Assert.assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);
        Assert.assertTrue(testJob.getCoreCompetency().getValue() == "Persistence");

    }

    @Test
    public void testToStringStartsAndEndsWithNewLine()
    {

    }
}
