package LLD1.Generics;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(12);
        l.add(4);
        l.add(7);

        System.out.println("Before Sorting : "+ l);
        Collections.sort(l);
        System.out.println("After Sorting : "+ l);
        Collections.reverse(l);
        System.out.println("Sorted Reverse : "+ l);
        System.out.println("Size : "+ l.size());
        l.add(1);
        l.add(12);
        l.add(4);
        l.add(7);

        System.out.println("Before Sorting : "+ l);
        Collections.sort(l);
        System.out.println("After Sorting : "+ l);
        Collections.reverse(l);
        System.out.println("Sorted Reverse : "+ l);
        System.out.println("Size : "+ l.size());

    }
}
