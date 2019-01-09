package cursJava.capitol8;
import java.io.*;

class C {
    int x=0;
// Obligatoriu constructor fara argumente
}
class D extends C implements Serializable {
    int y=0;
}
public class Test3 extends D {
    public Test3 () {
        x = 1; // NU
        y = 2; // DA
    }
    public String toString () {
        return x + ", " + y;
    }
}
