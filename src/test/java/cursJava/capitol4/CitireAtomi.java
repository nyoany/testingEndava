package cursJava.capitol4;
/* Citirea unei secvente de numere si siruri
dintr -un fisier specificat
si afisarea tipului si valorii lor
*/
import java.io.*;

public class CitireAtomi {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("fisier.txt"));
        StreamTokenizer st = new StreamTokenizer(br);

        int tip = st.nextToken();
        //se citeste primul atom lexical

        while (tip != StreamTokenizer.TT_EOF) {
            switch (tip) {
                case StreamTokenizer.TT_WORD:
                    System.out.println("Cuvant: " + st.sval);
                    break;
                case StreamTokenizer.TT_NUMBER:
                    System.out.println("Numar: " + st.nval);
            }
            tip = st.nextToken();
            //trecem la urmatorul atom
        }
    }
}