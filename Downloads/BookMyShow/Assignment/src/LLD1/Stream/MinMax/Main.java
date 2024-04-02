package LLD1.Stream.MinMax;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<String> list = Arrays.asList("A", "AAA", "BB", "BBBBB", "AAAAAA");
//        Comparator<String> comp = (a, b)->{
//            int l1 = a.length();
//            int l2 = b.length();
//            return Integer.compare(l2, l1);
//        };
        //min
//        String minString =list.stream().min(comp).get();
//        System.out.println(minString); //output: AAAAAA

        //max
//        String minString =list.stream().max(comp).get();
//        System.out.println(minString); //output: A

        //min
        List<Integer> list = Arrays.asList(10, 90, 80, 65, 36);
        Integer minString = list.stream().min((a, b)-> Integer.compare(a, b)).get();
        System.out.println(minString); //output: 10

        //max
        Integer maxString = list.stream().max((a, b)-> Integer.compare(a, b)).get();
        System.out.println(maxString); //output: 90



    }
}
