package cursJava.capitol5.Interfete;

import cursJava.capitol5.Interfete.StivaInlantuita.StackImpl2;
import cursJava.capitol5.Interfete.StivaLista.StackImpl1;

public class TestStiva {
    public static void  afiseaza(Stack s) {
        System.out.println("Continutul stivei este : " +s);
    }
    public static void main (String args[]) {
        try {
            Stack s1 = new StackImpl1();
            s1.push("a");
            s1.push("b");
            afiseaza(s1);

            Stack s2 = new StackImpl2();
            s2.push(new Integer (1));
            s2.push(new Double(3.14));
            afiseaza(s2);
        } catch (StackException e) {
            System.err.println("Eroare la lucrul cu stiva!");
            e.printStackTrace();
        }
    }
}
