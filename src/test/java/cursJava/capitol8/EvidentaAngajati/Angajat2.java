package cursJava.capitol8.EvidentaAngajati;
import java.io.*;

public class Angajat2 implements Serializable {
    static final long serialVersionUID = 5653493248680665297L;

    public String nume, adresa;
    public int salariu;
    public String parola;

    public Angajat2(String nume, int salariu, String parola) {
        this.nume = nume;
        this.adresa = "Iasi";
        this.salariu = salariu;
        this.parola = parola;
    }

    public String toString(){
        return nume + ( ("+ salariu + ") );
    }
}
