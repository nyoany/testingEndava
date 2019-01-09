package cursJava.capitol7;

import java.util.*;

/*
in exemplul de mai jos punem ˆıntr-un vector numerele de la 1 la 10, le
amestec˘am, dup˘a care le parcurgem element cu element folosind un iterator,
ˆınlocuind numerele pare cu 0.
 */

class TestIterator {
    public static void main(String args[]){
        ArrayList a = new ArrayList();

        // Adaugam numerele de la 1 la 10
        for (int i=1; i <=10; i++)
            a.add(new Integer (i));

        //Amestecam elementele colectiei
        Collections.shuffle(a);
        System.out.println("Vectorul amestecat: " + a);

        //parcurgem vectorul
        for (ListIterator it=a.listIterator(); it.hasNext();) {
            Integer x = (Integer) it.next();

            //Daca elementul curent este par, il facem 0
            if (x.intValue() %2 == 0)
                it.set(new Integer(0));
            System.out.println("Vectorul cu numere pare: " + a);
        }
    }

}
