package LLD1.HashMap.Example1WithoutGenerics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put(101, "Anil");
        map.put(102, "Durgesh");
        map.put(103, "Kishor");
        map.put(104, "Tejas");
        System.out.println(map); //inside this { } called entry

        Set set = map.entrySet();
        System.out.println(set); //inside this [ ]called set

        Iterator iterator= set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next()); //101=Anil
                                                 //102=Durgesh
                                                 //103=Kishor
                                                 //104=Tejas


        }

    }
}
