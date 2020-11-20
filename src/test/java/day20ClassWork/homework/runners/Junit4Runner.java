package day20ClassWork.homework.runners;

import day20ClassWork.homework.tests.SearchAllUserTest;
import day20ClassWork.homework.tests.SearchUserFullNameTest;
import day20ClassWork.homework.tests.SearchUserShortNameTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        SearchUserFullNameTest.class,
        SearchUserShortNameTest.class,
        SearchAllUserTest.class
})
public class Junit4Runner {
}
