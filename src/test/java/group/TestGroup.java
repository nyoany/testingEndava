package group;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

// Groups on Methods
// runSelenium() and runSelenium1() are belong to group selenium-test.
//  testConnectOracle() and testConnectMsSQL() are belong to group database.
//  runFinal() will be executed if groups selenium-test and database are passed.

public class TestGroup {

    @BeforeGroups("database")
    public void setupDB() {
        System.out.println("setupDB() - Before Group");
    }

    @AfterGroups("database")
    public void cleanDB() {
        System.out.println("cleanDB() - After Group");
    }

    @Test(groups= "selenium-test")
    public void runSelenium() {
        System.out.println("runSelenium() - Groups Selenium-test");
    }

    @Test(groups= "selenium-test")
    public void runSelenium1() {
        System.out.println("runSelenium()1 - groups Selenium - test");
    }

    @Test(groups = "database")
    public void testConnectOracle() {
        System.out.println("testConnectOracle() - groups database");
    }

    @Test(groups = "database")
    public void testConnectMsSQL() {
        System.out.println("testConnectMsSQL - groups database");
    }

    @Test(dependsOnGroups = {"database","selenium-test"})
    public void runFinal() {
        System.out.println("runFinal - depends on groups");
    }

}