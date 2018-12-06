package cursJava.capitol4;

import java.io.*;

public class Copiere {
    public static void main (String[] args) {
        try {
            FileReader in = new FileReader("in.txt");
            FileWriter out = new FileWriter("out.txt");

            int c;
            while ((c = in.read()) != -1)
                out.write(c);

            in.close();
            out.close();
        } catch (IOException e) {
            System.err.println("Eroare la operatiile cu fisiere!");
            e.printStackTrace();
        }
    }
}
