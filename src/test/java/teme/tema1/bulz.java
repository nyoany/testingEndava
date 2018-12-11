package teme.tema1;

import org.testng.annotations.Test;

@Test(groups= "tema1")
public class bulz {

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
        showBoltz(22);
    }
}

