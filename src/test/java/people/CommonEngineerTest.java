package people;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class CommonEngineerTest {

    private Engineer ae;

    public CommonEngineerTest(Engineer ae) {
        this.ae = ae;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> parameters() {
        return Arrays.asList(
                new Object[][] {
                        {new AutomatedEngineer(24,10)},
                        {new ManualEngineer(24,10)}
                }
        );
    }

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
