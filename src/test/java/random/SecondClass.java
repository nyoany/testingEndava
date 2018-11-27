package random;

import org.testng.annotations.Test;

public class SecondClass
{
    int number = 5; // integer; numere intregi
    char character = 'a'; // caractere; pot fi doar 1 singura
    String name = "Elena"; // insiruire de nume
    boolean abc = true; // folosit pentru a defini true sau false
    final String ADDRESS = "Nicolina"; // contastanta care nu se poate schimba niciodata pentru ca este final.

    @Test
    public void  method1 ()
    {
        number = number + 1;
        abc = true;
        name = name + "asdadsada";
        System.out.print(number);
        System.out.print(abc);
    }

    public void  method8 ()
    {
        number = number + 1;
        abc = true;
        name = name + "asdadsada";
    }

    @Test
    public void method3 ()
    {
        method1();
    }

    @Test
    public void methodFor()
    {
        int n = 5;
        for (int i=1; i<n; i++){
            System.out.print(i);
            System.out.print("\n"); // \n pune pe linii separate
        }
        if(number < 5)
        {
            System.out.print ("Mai mic ca 5");
        }
        else
        {
            System.out.print("nu este mai mic ca 5");
        }
    }
}
