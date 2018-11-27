package random.tutorials;

import org.testng.annotations.Test;

public class Threads {

    @Test(invocationCount = 3, threadPoolSize = 3)
    public void testThreadPools() {

        System.out.printf("Thread Id : %s%n", Thread.currentThread().getId());

    }

    @Test(invocationCount = 10, threadPoolSize = 3)
    public void testThreadPools2() {

        System.out.printf("Thread Id : %s%n", Thread.currentThread().getId());

    }
}
