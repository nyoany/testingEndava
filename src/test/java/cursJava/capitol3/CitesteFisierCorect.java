package cursJava.capitol3;

import java.io.*;
import org.testng.annotations.Test;

@Test(groups= "capitol3")
public class CitesteFisierCorect {
    public static void citesteFisierCorect(String fis)
    {
        FileReader f=null;
        try {
            // Deschidem Fisierul
            System.out.println("Deschidem fisierul " + fis);
            f = new FileReader(fis);
            // Citim si afisam fisuerul caracter cu caracter
            int c;
            while ((c=f.read()) != -1)
                System.out.print((char) c);
        } catch (FileNotFoundException e) {
            // Tratam un tip de exception
            System.err.println("Fisierul nu a fost gasit !");
            System.err.println("Exceptie: " + e.getMessage());
            System.exit(1);
        } catch (IOException e) {
            //Tratam alt tip de exceptie
            System.out.println("Eroare la citirea din fisier!");
    } finally {
            if (f != null) {
                System.out.println("\nInchidem Fisierul");
                try {
                    f.close();
                } catch (IOException e) {
                    System.err.println("Fisierul nu poate fi inchis!");
                }
            }
        }
    }
public static void main(String args[]) {
        if (args.length > 0)
            citesteFisierCorect(args[0]);
        else
            System.out.println("Lipseste numele fisierului !");
}
}
//ramas la pagina 82 3.3 aruncarea exceptiilor