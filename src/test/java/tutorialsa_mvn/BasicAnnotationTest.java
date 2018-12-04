package tutorialsa_mvn;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

//about Junit: https://www.mkyong.com/unittest/junit-4-tutorial-1-basic-usage/

public class BasicAnnotationTest {

    // Run once, e.g. Database connection, connection pool
    @BeforeClass
    public static void runOnceBeforeClass() {
        System.out.println("@BeforeClass - runOnceBeforeClass");
    }

    // Run once, e.g close connection, cleanup
    @AfterClass
    public static void runOnceAfterClass() {
        System.out.println("@AfterClass - runOnceAfterClass");
    }

    // Should rename to @BeforeTestMethod
    // e.g. Creating an similar object and share for all @Test
    @BeforeTest
    public void runBeforeTestMethod() {
        System.out.println("@Before - runBeforeTestMethod");
    }

    // Should rename to @AfterTestMethod
    @AfterTest
    public void runAfterTestMethod() {
        System.out.println("@After - runAfterTestMethod");
    }

    @Test
    public void test_method_1() {
        System.out.println("@Test - test_method_1");
    }

    @Test
    public void test_method_2() {
        System.out.println("@Test - test_method_2");
    }

}

//        # Run all the unit test classes.
//        $ mvn test
//
//        # Run a single test class.
//        $ mvn -Dtest=TestApp1 test
//
//        # Run multiple test classes.
//        $ mvn -Dtest=TestApp1,TestApp2 test
//
//        # Run a single test method from a test class.
//        $ mvn -Dtest=TestApp1#methodname test
//
//        # Run all test methods that match pattern 'testHello*' from a test class.
//        $ mvn -Dtest=TestApp1#testHello* test
//
//        # Run all test methods match pattern 'testHello*' and 'testMagic*' from a test class.
//        $ mvn -Dtest=TestApp1#testHello*+testMagic* test