package LLD1.HashMap.Example2WithGenerics;

import LLD1.Comparable.Employee;

import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(101,"Anil");
        map.put(102, "Kishor");
        map.put(103, "Durgesh");
        map.put(104, "Tejas");

        for(Map.Entry hm : map.entrySet()){
            System.out.println(hm.getKey()+" -> "+hm.getValue());
        }
    }
}
