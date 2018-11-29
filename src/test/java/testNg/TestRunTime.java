package testNg;
import org.testng.annotations.Test;

public class TestRunTime {
    @Test(expectedExceptions = ArithmeticException.class)
    public void divisionWithException() {
        int i = 1 / 0;
    }
}
