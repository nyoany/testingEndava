//1. facut o lista in care sunt niste numere, verificat ca suma tuturor numerelor este corecta

//2.o alta clasa in care este alt test care verifica ca toate numerele dintr-o lista sunt divizibile cu 3.

package list;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class listSum {

    @Test
    public static void intArrayExample() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(6);
        list.add(9);
        int suma = list.get(0)+list.get(1)+list.get(2);
        System.out.print ("Suma numerelor din array este: "+ suma);
        System.out.println();
        assertEquals(suma, 18); // verific ca suma e corecta
        for(int i=0; i<list.size(); i++){
            if (list.get(i)%3==0)
            {
            System.out.println("numarul de pe pozitia " + i+ " din array, adica numarul "+ list.get(i) + ", este divizibil cu 3");
            }

            else {
                System.out.println("numarul de pe pozitia " + i+ " din array, adica numarul "+ list.get(i) + ", NU este divizibil cu 3");
                }

                assertEquals( list.get(i)%3, 0);
        }

    }


}