package LLD1.Stream.String;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "AAA", "BB", "BBBBB", "AAAAAA");
        Comparator<String> comp = (a, b)->{
            int l1 = a.length();
            int l2 = b.length();
            return Integer.compare(l2, l1);
        };
        List<String> sortedString =list.stream().sorted(comp).toList();
        System.out.println(sortedString);
    }
}
