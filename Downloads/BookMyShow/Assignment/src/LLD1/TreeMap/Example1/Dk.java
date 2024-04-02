package LLD1.TreeMap.Example1;

import java.util.Collections;
import java.util.TreeMap;

public class Dk {
    public static void main(String[] args) {
        // Creating a TreeMap with default natural ordering (using Comparable)
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Three");
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        System.out.println("TreeMap with natural ordering: " + treeMap);

        // Creating a TreeMap with custom ordering (using Comparator)
        TreeMap<Integer, String> customTreeMap = new TreeMap<>(Collections.reverseOrder());
        customTreeMap.put(3, "Three");
        customTreeMap.put(1, "One");
        customTreeMap.put(2, "Two");
        System.out.println("TreeMap with custom ordering: " + customTreeMap);
    }
}
