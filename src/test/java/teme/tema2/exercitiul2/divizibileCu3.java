package teme.tema2.exercitiul2;

import org.testng.annotations.Test;

public class divizibileCu3 {
  @Test
    private void divizibilCu3()
    {
        int n = 30;
        for(int i=1; i<=n; i++)
        {
            if(i%3 == 0) //i%10 == 3 || String.valueOf(i).contains("3"))
            {
                System.out.println(i + " este divizibil cu 3!");
            }
            else
            {
                System.out.println(i);
            }
        }
    }
}
