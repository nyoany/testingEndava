package testing;

import org.testng.annotations.Test;

public class SecondClass
{
    int number = 1;
    char character = 'a';
    String name = "Elena";
    boolean abc = false;
    final String ADDRESS = "Nicolina";


    @Test
    public void method1()
    {
        number = number + 1;
        abc = true;
        name = name + "asdahdhsaa";
    }

    @Test
    public void method1(String param)
    {
        number = number + 1;
        abc = true;
        name = name + param;
    }

    public void method3()
    {
        method1();
        method1("abc");
    }

    @Test
    public void methodForIf()
    {
        int n = 5;
        for (int i=1; i<n; i++){
            System.out.print(i);
            System.out.print("\n");
        }

        if(number < 5)
        {
            System.out.print("Mai mic ca 5.");
        }
        else
        {
            System.out.print("Nu este mai mic ca 5.");
        }
    }

    private void showBoltz(int max)
    {
        for(int i=1; i<max; i++)
        {
            if(i%7 ==0 || i%10 == 7 || String.valueOf(i).contains("7"))
            {
                System.out.println("Boltz!");
            }
            else
            {
                System.out.println(i);
            }
        }
    }

    @Test
    public void showBoltz()
    {
        showBoltz(280);
    }


}
