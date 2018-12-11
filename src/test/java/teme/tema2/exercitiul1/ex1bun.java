package teme.tema2.exercitiul1;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Test(groups= "tema2")
class ex1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(sum(list));
    }
    public static int sum(List<Integer> list) {
        Iterator<Integer> it = list.iterator();
        int suma = 0;
        while (it.hasNext()) {
            int num = it.next();
            if (num >= 1) {
                suma += num;
            }
        }
        System.out.println("Suna numerelor din lista este: ");
        return suma;
    }
}
