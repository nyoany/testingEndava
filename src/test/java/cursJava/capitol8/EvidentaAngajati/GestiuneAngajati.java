package cursJava.capitol8.EvidentaAngajati;
import java.io.*;
import java.util.*;

public class GestiuneAngajati {

    //Lista Angajatilor
    ArrayList ang = new ArrayList();

    public void citire() throws IOException {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream (" angajati .ser");
            ObjectInputStream in = new ObjectInputStream (fis);
            ang = ( ArrayList ) in. readObject ();
        } catch ( FileNotFoundException e) {
            System . out. println (" Fisierul nou ... ");
        } catch ( Exception e) {
            System . out. println (" Eroare la citirea datelor ...");
            e. printStackTrace ();
        } finally {
            if (fis != null )
                fis . close ();
        }
        System . out. println (" Lista angajatilor :\n" + ang);
    }

    public void salvare() throws IOException {
        FileOutputStream fos = new FileOutputStream("angajati.ser");
        ObjectOutputStream out = new ObjectOutputStream(fos);
        out.writeObject(ang);
    }

    public void adaugare() throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.print("\nNume:");
            String nume = stdin.readLine();

            System.out.print("Salariu:");
            int salariu = Integer.parseInt(stdin.readLine());

            System.out.print("Parola:");
            String parola = stdin.readLine();

            ang.add(new Angajat(nume, salariu, parola));

            System.out.print("Mai adaugati ? (D/N)");
            String raspuns = stdin.readLine().toUpperCase();
            if (raspuns.startsWith("N"))
                break;
        }
    }

    public static void main(String args[]) throws IOException {
        GestiuneAngajati app = new GestiuneAngajati();

        //incarcam angajatii din fisier
        app.citire();

        //adaugam noi angajati
        app.adaugare();

        //salvam angajatii inapoi in fisier
        app.salvare();
    }
}
