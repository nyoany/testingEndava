package teme.tema2.exercitiul1;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.*;

public class ex1Incercari {
     /*  public static void main(String[] args) {
           List<String> list = new ArrayList<String>();
           list.add("1");
           list.add("2");
           System.out.println("#1 normal for loop");
           for (int i = 0; i < list.size(); i++) {
               System.out.println(list.get(i));
           }
       }
*/
    @Test
    public void sumaNumereDinLista() {
        List<Integer> list = new ArrayList<Integer>();
      list.add(1);
      list.add(2);
      list.add(3);
      list.add(4);
      list.add(5);

        double sum = 0;
        for (int i = 1; i < list.size(); i++) {
            System.out.println(sum += list.get(i));
        }
    }
}
