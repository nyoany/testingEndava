package testNg;
import org.testng.annotations.Test;

public class AritheticException {
    @Test(expectedExceptions = ArithmeticException.class)
    public void divisionWithException() {
        int i = 1 / 0;
    }
}
