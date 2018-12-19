package cursJava.capitol5;

public class Persoana {
    int cod;
    String nume;

    public Persoana(int cod, String nume) {
        this.cod = cod;
        this.nume = nume;
    }

    public String toString() {
        return cod + " \t " + nume;
    }
}

class Sortare {
    public static void main (String args[]) {
        Persoana p[] = new Persoana[4];
        p[0] = new Persoana(3, "Ionescu");
        p[1] = new Persoana(1, "Vasilesc");
        p[2] = new Persoana(2, "Georgescu");
        p[3] = new Persoana(4, "Popescu");

        java.util.Arrays.sort(p);

        System.out.println("Persoanele ordonate dupa cod:");
        for (int i = 0;i<p.length; i++);
      //  System . out. println (p[i]);
    }
}