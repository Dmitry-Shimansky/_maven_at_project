package people;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class AutomatedTest {

    AutomatedEngineer ae = new AutomatedEngineer(24,10);

    @Test
    public void checkDefaultAge() {
        assertEquals(24,ae.getAge());
    }

    @Test
    public void checkSetAge() {
        ae.setAge(26);
        assertEquals(26,ae.getAge());
    }

    @Test
    public void checkDefaultSkill() {
        assertEquals(24,ae.getSkill());
    }

    @Test
    public void checkSetSkill() {
        ae.setSkill(26);
        assertEquals(26,ae.getSkill());
    }

    @Test
    public void checkDefaultExperience() {
        assertEquals(10,ae.getExperience());
    }

    @Test
    public void checkSetExperience() {
        ae.setExperience(26);
        assertEquals(26,ae.getExperience());
    }
}
