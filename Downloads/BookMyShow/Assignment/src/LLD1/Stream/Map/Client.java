package LLD1.Stream.Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Client {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        List<Integer> mappedStream = list.stream().map(i ->i*2).toList();
        System.out.println(mappedStream);
    }
}
