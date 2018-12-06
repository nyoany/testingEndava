package cursJava.capitol3;

import org.testng.annotations.Test;

import java.io.FileReader;


@Test
public class Exemplu {
    public static void main(String args[]) {
        int v[] = new int[10];
        v[10] = 0; //Exceptie !
        System.out.println("Aici nu se mai ajunge...");
    }
}


