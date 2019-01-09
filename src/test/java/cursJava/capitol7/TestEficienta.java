package cursJava.capitol7;
import java.util.*;

/*
capitol 7 folosirea eficienta a colectiilor
exemplu ce creeaza o list˘a folosind ArrayList, respectiv
LinkedList ¸si execut˘a diverse operat¸ii pe ea, cronometrˆand timpul necesar
realiz˘arii acestora:
*/


public class TestEficienta {
    final static int N = 100000;

    public static void testAdd(List lst) {
        long t1 = System.currentTimeMillis();
        for (int i=0; i<N; i++)
            lst.add(new Integer(i));
        long t2 = System.currentTimeMillis();
        System.out.println("Add: " + (t2 - t1));
    }

    public static void testGet(List lst){
        long t1 = System.currentTimeMillis();
        for (int i=0; i<N; i++)
            lst.get(i);
        long t2 = System.currentTimeMillis();
        System.out.println("Get: " + (t2 - t1));
    }

    public static void testRemove(List lst) {
        long t1 = System.currentTimeMillis();
        for (int i=0; i<N; i++)
            lst.remove(0);
        long t2 = System.currentTimeMillis();
        System.out.println("Remove: " + (t2 - t1));
    }

    public static void main(String args[]){
        System.out.println("Arraylist");
        List lst1 = new ArrayList();
        testAdd(lst1);
        testGet(lst1);
        testRemove(lst1);

        System.out.println("LinkedList");
        List lst2 = new LinkedList();
        testAdd(lst2);
        testGet(lst2);
        testRemove(lst2);
    }
}
