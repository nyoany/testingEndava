package cursJava.capitol3;

import java.io.*;

class ExceptieStiva  extends Exception{
    public ExceptieStiva (String mesaj) {
        super(mesaj);
    }
}

class Stiva {
    int elemente [] = new int[100];
    int n=0; // numarul de elemente din stiva

    public void adauga(int x) throws ExceptieStiva {
        if (n==100)
            throw new ExceptieStiva("Stiva este plina!");
        elemente[n++] = x;
    }

    public int scoate() throws ExceptieStiva {
        if (n==0)
            throw new ExceptieStiva("Stiva este goala!");
        return elemente[n--];
    }
}

