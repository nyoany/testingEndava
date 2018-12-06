/*package cursJava.capitol3;

import org.testng.annotations.Test;

import java.io.FileReader;

@Test
public class CitesteFisier {
    public static void citesteFisier(String fis) {
        FileReader f = null;
        // Deschidem fisierul
        System.out.println("Deschidem fisierul " + fis);
        f = new FileReader(fis);

        //Citim si afisam fisierul caracter cu caracter
        int c;
        while ((c = f.read()) != -1)
            System.out.print((char) c);

        //Inchidem fisierul
        System.out.print("\\nInchidem fisierul " + fis);
        f.close();
    }
}
*/