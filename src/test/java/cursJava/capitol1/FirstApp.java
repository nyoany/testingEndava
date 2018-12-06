/*package cursJava.capitol1;

import org.testng.annotations.Test;
*/
/*@Test
class FirstApp {
    public static void main( String args[]) {
        System.out.println("Hello world!");
    }

    i=0;
    eticheta:
            while (i < 10) {
        System.out.println("i="+i);
        j=0;
        while (j < 10) {
            j++;
            if (j==5) continue eticheta;
            if (j==7) break eticheta;
            System.out.println("j="+j);
        }
        i++;
    }

    int v[]={3, 1, 4, 2};
        java.util.Arrays.sort(v);
// Sorteaza vectorul v
// Acesta va deveni {1, 2, 3, 4}

            for(int i=0; i<a.length; i++)
    b[i] = a[i];
// Varianta 2
        System.arraycopy(a, 0, b, 0, a.length);
// Nu are efectul dorit
    b = a;

}
*/
/*
    final double PI = 3.14;
    final int MINIM=0, MAXIM = 10;
    int valoare = 100;
    char c1=’j’, c2=’a’, c3=’v’, c4=’a’;
    long numarElemente = 12345678L;
    String bauturaMeaPreferata = "apa";

     String culori[] = {"Rosu", "Galben", "Verde"};
     int []factorial = {1, 1, 2, 6, 24, 120};

     Tip[] numeVector = new Tip[nrElemente];

        v = new int[10];
//aloca spatiu pentru 10 intregi: 40 octeti
        c = new char[10];
//aloca spatiu pentru 10 caractere: 20 octeti

        numeVector = new Tip[nrElemente];

        int v[10]; //ilegal
        int v[] = new int[10]; //corect

        Tip matrice[][] = new Tip[nrLinii][nrColoane];

        int []a = new int[5];
// a.length are valoarea 5
        int m[][] = new int[5][10];
// m[0].length are valoarea 10

        int a[] = {1, 2, 3, 4};
        int b[] = new int[4];
// Varianta 1


        String s = "abc";
        String s = new String("abc");
        char data[] = {"a", "b", "c"};
        String s = new String(data);

        String s1 = "abc" + "xyz";
        String s2 = "123";
        String s3 = s1 + s2;

        System.out.print("Vectorul v are" + v.length + " elemente");
        String x = "a" + 1 + "b"

        String x = new StringBuffer().append("a").append(1).
        append("b").toString()

public static void main (String args[]) {
        int numarArgumente = args.length ;
        }
*/
/*
        @Test
public class Salut {
    public static void main (String args[]) {
        if (args.length == 0) {
            System.out.println("Numar insuficient de argumente!");
            System.exit(-1); //termina aplicatia
        }
        String nume = args[0]; //exista sigur
        String prenume;
        if (args.length >= 1)
            prenume = args[1];
        else
            prenume = ""; //valoare implicita
        System.out.println("Salut " + nume + " " + prenume);
    }
}
*/
/*
@Test
public class Afisare {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++)
            System.out.println(args[i]);
    }
}
*/
/*
@Test
public class Power {
    public static void main(String args[]) {
        double numar = Double.parseDouble(args[0]);
        int putere = Integer.parseInt(args[1]);
        System.out.println("Rezultat=" + Math.pow(numar, putere));
    }
}
*/
