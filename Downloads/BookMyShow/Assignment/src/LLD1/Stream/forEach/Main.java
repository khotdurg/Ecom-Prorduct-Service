package LLD1.Stream.forEach;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
       // List<Integer> list = Arrays.asList(10, 90, 80, 65, 36);
        //list.stream().forEach(i-> System.out.print(i+ " "));
        //list.stream().forEach(System.out::println);
        //list.forEach(System.out::println);


//        Stream<?>item = Stream.of(9, 88, 777, "a", "cc");
//        item.map(i-> i).forEach(System.out::println);

        int[] arr = {10, 15, 20, 25};
        Arrays.stream(arr).filter(i->i%2==0).forEach(System.out::println);
    }
}
