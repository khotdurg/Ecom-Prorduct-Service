package LLD1.TreeMap.Example2;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        // Creating a TreeMap with custom comparator
        TreeMap<Employee, String> employeeTreeMap = new TreeMap<>(new EmployeeComparator());
        employeeTreeMap.put(new Employee("Alice", 30), "Accounting");
        employeeTreeMap.put(new Employee("Bob", 25), "Marketing");
        employeeTreeMap.put(new Employee("Charlie", 35), "HR");

        // Printing TreeMap entries
        for (Employee emp : employeeTreeMap.keySet()) {
            System.out.println(emp + " works in " + employeeTreeMap.get(emp));
        }

    }
}