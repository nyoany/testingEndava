package cursJava.capitol8;
import java.io.*;
//Listing 8.9: Serializare implicit˘a

class Persoana1 implements Serializable{
    int cod;
    String nume;

    public Persoana1(String nume, int cod) {
        this.nume = nume;
        this.cod = cod;
    }
}
