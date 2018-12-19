package cursJava.capitol5.ClasaAnonima;
import java.io.*;

/*
listarea fisierelor din directorul curent
folosind o clasa anonima pentru filtru.
*/

public class Listare2 {
    public static void main (String[] args) {
        try {
            File director = new File(".");
            String[] list;
            if (args.length > 0) {
                final String extensie = args[0];
                list = director.list(new FilenameFilter() {
                    public boolean accept(File dir, String name) {
                        return (name.endsWith("." + extensie));
                    }
                });
            }
            else
                list = director.list();

            for (int i=0; i< list.length; i++);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
