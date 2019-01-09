package cursJava.capitol8;
import java.io.*;

// Listing 8.1: Modificatorii static ¸si transient

public class Test1 implements Serializable {
    int x=1; //da
    transient int y=2; //nu
    transient static int z=3; // da
    static int t=4; // da

    public String toString() {
        return x + ", " + y + "," + z + "," + t;
    }
}


