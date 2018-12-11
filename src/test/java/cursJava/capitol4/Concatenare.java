package cursJava.capitol4;

/* concatenarea a doua fisiere ale caror nume sunt
primite de la linia de comanda. Rezultatul
concatenarii este afisat pe ecran.
//concatenare a 2 sau mai multe fluxuri
*/

import org.testng.annotations.Test;

import java.io.*;
@Test(groups= "capitol4")
//concatenare 2 fisiere
public class Concatenare {
    public static void main (String args[]) {
        if (args.length <=1) {
            System.out.println("Argumente insuficiente pentru 2 fisiere!");
            System.exit(-1);
        }
        try {
            FileInputStream f1 = new FileInputStream(args[0]);
            FileInputStream f2 = new FileInputStream(args[1]);
            SequenceInputStream s = new SequenceInputStream(f1, f2)
                    ;
            int c;
            while ((c = s.read()) != -1)
                System.out.println((char)c);
            s.close();
            //f1 si f2 sunt inchise automat
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


