package cursJava.capitol3;
import java.io.*;

public class Listing32CitireaUnuiFisier {
    public static void citesteFisier (String fis)
        throws FileNotFoundException, IOException {
        FileReader f = null;
        f = new FileReader(fis);

        int c;
        while ((c=f.read()) != -1)
            System.out.print((char)c);

        f.close();
    }
    public static void main (String args[]){
        if (args.length > 0){
            try {
                citesteFisier(args[0]);
            } catch (FileNotFoundException e) {
                System.err.println("Fisierul nu a fost gasit !");;
                System.err.println("Exceptie: " + e);
            }
            catch (IOException e) {
                System.out.print("Eroare la citirea din fisier!");
                e.printStackTrace();
            }
        }
        else
            System.out.println("Lipseste numele fisierului!");
    }


    public static void citesteFisier2 (String numeFisier)
        throws FileNotFoundException, IOException {
            FileReader f = null;
            try {
                f = new FileReader(numeFisier);
                int c;
                while ((c=f.read()) != -1)
                    System.out.println((char)c);
            }
            finally {
                if (f!=null)
                    f.close();
            }
        }
}


