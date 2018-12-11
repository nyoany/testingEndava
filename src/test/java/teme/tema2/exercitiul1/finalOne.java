/*package teme.tema2.exercitiul1;
import java.util.*;
import java.util.stream.Collectors;

class finalOne {
    public static void main(String[] args)
    {
        List<Integer[]> list = new ArrayList<>();
        Integer[] a1 = {6,3,8,12};
        list.add(a1);
        Integer[] a2 = {8,13,9,22};
        list.add(a2);
        System.out.println("Suma numerelor este: ");
        int sum = list.stream().flatMap(a->Arrays.stream(a)).collect(Collectors.summingInt(i->i));
        System.out.println(sum);
        System.out.println("Varianta 2 pt suma numerelor este: ");
        IntSummaryStatistics stats = list.stream().flatMap(a->Arrays.stream(a)).collect(Collectors.summarizingInt(i->i));
        System.out.println(stats.getSum());
        System.out.println("Varianta 3:");
        sum = list.stream().flatMap(a->Arrays.stream(a)).mapToInt(Integer::intValue).sum();
        System.out.println(sum);
     }

}
*/