
//In TestNG, we use dependOnMethods and dependsOnGroups to implement dependency testing. If a dependent method is fail, all the subsequent test methods will be skipped, NOT failed.
//
//        1. dependOnMethods Example
//        A simple example, “method2()” is dependent on “method1()”.

package dependency;

        import org.testng.annotations.Test;

public class App {
    //This test will be failed. remove trow exception to make it work
    @Test
    public void method1() {
        System.out.println("This is method 1");
       // throw new RuntimeException();
    }

    @Test(dependsOnMethods = { "method1" })
    public void method2() {
        System.out.println("This is method 2");
    }

}