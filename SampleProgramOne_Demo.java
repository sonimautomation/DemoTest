package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleProgramOne_Demo {
	@Test
    public void testOne() {
        Assert.assertTrue(true);
        System.out.println("Pass Test case - testOne");
    }
 
    @Test
    public void testTwo() {
        Assert.assertEquals("AutomationgTesting", "AutomationgTest");
        System.out.println("Pass Test case - testOne");
    }
 
    @Test
    public void testThree() {
        Assert.assertTrue(true);
        System.out.println("Pass Test case - testThree");
    }

}
