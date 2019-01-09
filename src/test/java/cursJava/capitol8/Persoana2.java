package cursJava.capitol8;
import java.io.*;

//Listing 8.10: Serializare proprie

class Persoana2 implements Externalizable{
    int cod;
    String nume;

    public Persoana2(String nume, int cod) {
     this.nume = nume;
     this.cod = cod;
    }

    public void writeExternal(ObjectOutput s) throws IOException {
        s.writeUTF(nume);
        s.writeInt(cod);
    }

    public void readExternal(ObjectInput s) throws IOException, ClassNotFoundException {
        nume = s.readUTF();
        cod = s.readInt();
    }
}
