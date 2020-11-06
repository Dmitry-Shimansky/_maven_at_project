package people;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ManualTest {

    @Test
    public void testAgeExperience () {
        ManualEngineer manualTest = new ManualEngineer(25,2);
        assertEquals("The age is not correct!",25,manualTest.age);
    }

    @Test
    public void testExperience () {
        ManualEngineer manualTest = new ManualEngineer(25,2);
        assertEquals(2,manualTest.experience);
    }

    @Test
    public void testSkill () {
        ManualEngineer manualTest = new ManualEngineer(25,2);
        assertEquals(4,manualTest.skill);
    }
}
