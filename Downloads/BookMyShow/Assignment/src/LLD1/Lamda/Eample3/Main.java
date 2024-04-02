package LLD1.Lamda.Eample3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //normal
        List<Integer> numbers
                = Arrays.asList(11, 22, 33, 44,
                55, 66, 77, 88,
                99, 100);

        // External iterator
        for (int i = 0; i < numbers.size(); i++) {
          //  System.out.print(numbers.get(i) + " ");
        }

        //lamdba
        List<Integer> list = Arrays.asList(11, 22, 33, 44, 55, 66, 77, 88, 99, 100);
       // list.forEach(n-> System.out.print(n+" "));

        System.out.println(list.stream()
                .filter(a-> a%2==0)
                .mapToInt(b-> b*2)
                .sum());
    }
}
