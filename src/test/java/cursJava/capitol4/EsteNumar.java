/*
In exemplul urmator este prezentat un program care afiseaza liniile introduse
de la tastatura pana ın momentul ın care se introduce linia ”exit” sau
o linie vida si mentioneaza daca sirul respectiv reprezinta un numar sau nu.
Citeste siruri de la tastatura si verifica
daca reprezinta numere sau nu


va ramane agatata pt ca asteapta input de la tastatura
 */

package cursJava.capitol4;
import java.util.Scanner;
import java.io.*;

public class EsteNumar {
    public static void main (String[] args) {
        BufferedReader stdin = new BufferedReader(
                new InputStreamReader(System.in));
                try {
                    while (true) {
                        String s = stdin.readLine();
                        if (s.equals("exit") || s.length() == 0)
                            break;
                        System.out.print(s);
                        try {
                            Double.parseDouble(s);
                            System.out.println(": DA");
                        } catch (NumberFormatException e) {
                            System.out.println(": NU");
                        }
                    }
                } catch (IOException e) {
                    System.err.println("Eroare la intrarea standard!");
                    e.printStackTrace();
        }
    }
}
