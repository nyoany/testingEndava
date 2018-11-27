package Testing;

import org.testng.annotations.Test;

import static java.lang.Integer.parseInt;

public class BoltzAlina {

    int nr = 0;

    @Test
    public void MethodBoltIncomplee() {
        int limita = 100;
        for (int i = 1; i < limita; i++) {
            if (i % 7 == 0) {

                System.out.println("BOLT");

            } else {
                System.out.println("Player say: " + i);
            }
        }
    }

    @Test

    public void methodBoltComplete() {

        int limit = 100;
        while (nr < limit) {
            nr++;
            String str = Integer.toString(nr);
            int lastch = parseInt(String.valueOf(str.charAt(str.length() - 1)));
            if (lastch == 7) {
                System.out.println("BOLTZ ends in 7");
            } else if (nr % 7 == 0) {
                System.out.println("BOLTZ divisible by 7");
            } else {
                System.out.println(nr);
            }

        }
    }

    @Test

    public void methodBoltSimple() {

        int lim = 100;
        int number = 1;
        while (number < lim) {
            number++;
            if (number %7 == 0 || number %10 ==7) {
                System.out.println("BOLTZ");
            } else {
                System.out.println(number);
            }

        }
    }

    @Test

    public void methodBoltPlayer() {
        String[] arrPlayer = {"Mary1", "John2", "Tim3", "Nelu4", "Carmen5"};
        int times = 0;
        while (times < 100) {
            for (int index = 0; index < arrPlayer.length; index++) {
                String names = arrPlayer[index];
                System.out.println(names);
            }
            times++;
        }
    }
}

