package people;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.both;
import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void testPersonAge() {
        Person person = new Person(25);
        assertEquals("The age is not correct!", 24, person.getAge());
    }

    @Test
    public void testPersonSetAge() {
        Person person = new Person(25);
        assertEquals("The age is not correct!", 26, person.getAge());
    }

    @Test
    public void testPersonDoubleAge() {
        Person person = new Person(2 * 20);
        assertEquals("The age is not correct!", 40, person.getAge());
    }

    @Test
    public void testDemo1() {

        boolean check = false;

        if ("bugagaha".contains("bu")&&"bugagaha".contains("ga")) {
            check = true;
        }

        assertEquals("The age is not correct!", true,check);
    }

    @Test
    public void testDemo2() {

        assertThat("bugagaha", both(containsString("bu")).and(containsString("ga")));
    }
}
