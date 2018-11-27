package random;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;



@Test
public class ThirdClass {

    @BeforeClass
    public static void runOnceBeforeClass() {
        System.out.println("@BeforeClass - runOnceBeforeClass");
    }

    int number = 55;

    @Test
    public void methodBult()
    {
        int n = 22;
        for (int i=1; i<=n; i++) {
            System.out.print(i);
            System.out.print("\n");
            if(number == 7)
            {
                System.out.print ("Bultz");
            }

        }
    }

    @BeforeMethod
    public void runBeforeTestMethod() {
        System.out.println("@Before - runBeforeTestMethod");
    }

    @Test
    public void methodBultz2()
    {
        int n = 22;
        for (int i=1; i<=n; i++)
        {
            System.out.print("\n");
            if (i == 7)
            {
                System.out.print("Bultz");
            }
            else if (i == 14)
            {
                System.out.print("Bultz");
            }
            else if (i == 17)
            {
                System.out.print("Bultz");
            }
            else if (i == 21)
            {
                System.out.print("Bultz");
            }
            else
            {
                System.out.print(i);
            }

        }
    }



    @AfterMethod
    public void runAfterTestMethod() {
        System.out.println("@After - runAfterTestMethod");
    }

    @AfterClass
    public static void runOnceAfterClass() {
        System.out.println("@AfterClass - runOnceAfterClass");
    }
}





