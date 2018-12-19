package cursJava.capitol5.ListareFisiere;
import java.io.*;

/* Listarea fisierelor din directorul curent
care au anumita extensie primita ca argument .
Daca nu se primeste nici un argument , vor fi listate toate
.
*/

class Listare {
   public static void main (String [] args) {
       try {
           File director = new File(".");
           String[] list;
           if (args.length > 0)
               list = director.list(new Filtru(args[0]));
           else
               list = director.list();

           for (int i = 0; i<list.length; i++)
               System.out.println(list[i]);
       } catch(Exception e) {
           e.printStackTrace();
       }
   }
}

class Filtru implements FilenameFilter {
    String extensie;
    Filtru (String extensie) {
        this.extensie = extensie;
    }
    public boolean accept (File dir, String name) {
        return (name.endsWith("." + extensie));
    }
}
