package cursJava.capitol8.EvidentaAngajati;

import java.io.*;

class Angajat implements Serializable {
    static final long serialVersionUID = 5653493248680665297L;
    public String nume;
    public int salariu;
    private String parola;

    public Angajat (String nume, int salariu, String parola) {
        this.nume = nume;
        this.salariu = salariu;
        this.parola = parola;
    }

    public String toString(){
        return nume + "("+ salariu + ")";
    }
}
