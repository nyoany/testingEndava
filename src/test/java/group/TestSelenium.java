package group;
//Groups on Class
//The “Group” can be applied on class level.
// In below example, every public method of this class “TestSelenium” is belong to
// group selenium-test.


import org.testng.annotations.Test;

@Test(groups= "selenium-test")
public class TestSelenium {

    public void runSelenium() {
        System.out.println("runSelenium()");
    }

    public void runSelenium1() {
        System.out.println("runSelenium()1");
    }

}