package LLD1.Stream.Filter;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list  = Arrays.asList(5, 10, 15, 35, 20);
        List<Integer> filteredList = list.stream().filter(i -> i%2==0).toList(); // converting into stream // if it is a predicate interface then we can use lamda expression
        System.out.println(filteredList);
    }
}
