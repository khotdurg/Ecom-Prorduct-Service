package LLD1.Stream.Map.Example1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Q. select only passed student
        List<Integer> marks = Arrays.asList(10, 50, 75, 35, 30, 20, 40);
        List<Integer> passed = marks.stream().filter(i-> i >= 35).toList();
        System.out.println(passed);

        //Q. add 5 gracemarks to failed student
        List<Integer> graceMarks = marks.stream().filter(i -> i < 35).map(i->i+5).toList();
        System.out.println(graceMarks);
    }
}
