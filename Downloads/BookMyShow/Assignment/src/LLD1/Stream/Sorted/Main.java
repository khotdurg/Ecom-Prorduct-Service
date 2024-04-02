package LLD1.Stream.Sorted;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Ascending order sorting
        List<Integer> marks = Arrays.asList(10, 50, 75, 35, 30, 20, 40);
        List<Integer> sortedMarks = marks.stream().sorted().toList();
        System.out.println(sortedMarks);

        //Descending order sorting
//        List<Integer> descendingOrder =sortedMarks.stream().sorted((a, b)-> (a<b)?1: (a>b)?-1 :0).toList();
//        System.out.println(descendingOrder);
//        List<Integer> descendingOrder = marks.stream().sorted((a,b)-> (a<b)?1 : (a>b)?-1 : 0).toList();
//        System.out.println(descendingOrder);

//        List<Integer> descendingOrder = marks.stream().sorted((a,b)-> b.compareTo(a)).toList();
//        System.out.println(descendingOrder);

//        List<Integer> descendingOrder = marks.stream().sorted((a,b)-> a.compareTo(b)).toList();
//        System.out.println(descendingOrder);

        List<Integer> descendingOrder = marks.stream().sorted((a,b)-> -a.compareTo(b)).toList();
        System.out.println(descendingOrder);

    }
}
