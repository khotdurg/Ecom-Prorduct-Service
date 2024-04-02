package LLD1.Stream.Count;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //count fail students marks
        List<Integer> marks = Arrays.asList(10, 50, 75, 35, 30, 20, 40);
        List<Integer> failedStudentmarks = marks.stream().filter(i-> i<35).toList();
        System.out.println(failedStudentmarks);

        // failed Student count
        long failedStudentCount = marks.stream().filter(i -> i<35).count();//count return type is long that's why cant make int
        System.out.println(failedStudentCount);
    }
}
