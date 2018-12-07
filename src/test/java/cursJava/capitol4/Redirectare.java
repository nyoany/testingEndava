package cursJava.capitol4;
import java.io.*;

public class Redirectare {
    public static void main (String[] args) {
        try {
            BufferedInputStream in = new BufferedInputStream(
                    new FileInputStream("intrare.txt")
            );
            PrintStream out = new PrintStream(
                    new FileOutputStream("rezultate.txt")
            );
            PrintStream err = new PrintStream(
                    new FileOutputStream("erori.txt")
            );
            System.setIn(in);
            System.setOut(out);
            System.setErr(err);

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(System.in)
            );
            String s;
            while ((s = br.readLine()) != null) {
                //liniile vor fi citite din fisierul intrare.txt si vor fi scrise in fisierul rezultate.txt
            System.out.println(s);
            }
            //aruncam foartat o exceptie
            throw new IOException("Test");
        } catch (IOException e) {
           // Daca apar exceptii, ele vor fi scrise in fisierul erori.txt
          System.err.println("Eroare intrare/iesire!");
          e.printStackTrace();
        }
    }
}
