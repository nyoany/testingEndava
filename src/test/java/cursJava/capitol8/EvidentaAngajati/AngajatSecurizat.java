package cursJava.capitol8.EvidentaAngajati;

import java.io.*;

public class AngajatSecurizat implements Serializable {

    static final long serialVersionUID = 5653493248680665297L;
    public String nume, adresa;
    public int salariu;
    private String parola;

    public AngajatSecurizat(String nume, int salariu, String parola) {
        this.nume = nume;
        this.adresa = " Iasi ";
        this.salariu = salariu;
        this.parola = parola;
    }

    public String toString() {
        return nume + " (" + salariu + ")";
    }

    static String criptare(String input, int offset) {
        StringBuffer sb = new StringBuffer();
        for (int n = 0; n < input.length(); n++)
            sb.append((char) (offset + input.charAt(n)));
        return sb.toString();
    }

    private void writeObject(ObjectOutputStream stream) throws IOException {
        parola = criptare(parola, 3);
        stream.defaultWriteObject();
        parola = criptare(parola, -3);
    }

    private void readObject(ObjectInputStream stream)
            throws IOException, ClassNotFoundException {
        stream.defaultReadObject();
        parola = criptare(parola, -3);
    }
}



