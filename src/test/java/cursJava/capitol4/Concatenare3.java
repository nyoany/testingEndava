//concatenare a 2 sau mai multe fluxuri
package cursJava.capitol4;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

//concatenare 4 fisiere
public class Concatenare3 {
    public static void main (String args[]) {
        if (args.length <=1) {
            System.out.println("Argumente insuficiente pentru 4 fisiere!");
            System.exit(-1);
        }
        try {
            FileInputStream f1 = new FileInputStream(args[0]);
            FileInputStream f2 = new FileInputStream(args[1]);
            FileInputStream f3 = new FileInputStream(args[2]);
            FileInputStream f4 = new FileInputStream(args[3]);
            SequenceInputStream s1 = new SequenceInputStream(f1, f2);
         // SequenceInputStream s1 = new SequenceInputStream(f1, new SequenceInputStream(f2, f3));
            SequenceInputStream s = new SequenceInputStream(s1, new SequenceInputStream(f3, f4))
                    ;
            int c;
            while ((c = s.read()) != -1)
                System.out.println((char)c);
            s.close();
            //f1, f2, f3 si f4  sunt inchise automat
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
