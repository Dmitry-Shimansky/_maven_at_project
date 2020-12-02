package day23ClassWork.homeWork.runners;

import day23ClassWork.homeWork.pages.CheckboxPage;
import day23ClassWork.homeWork.tests.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TextBoxTest.class,
        CheckboxTest.class,
        RadioButtonTest.class,
        WebtablesTest.class,
        ButtonsCheckingTest.class
})

public class JUnitRunner {
}
