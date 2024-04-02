package LLD1.ConcurrentHashMap.Example2;

import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static void main(String[] args) {
        ConcurrentHashMap<Employee, Department> employeeDepartmentMap = new ConcurrentHashMap<>();

        // Adding employees and their departments to the ConcurrentHashMap
        employeeDepartmentMap.put(new Employee("Alice", 30), new Department("HR"));
        employeeDepartmentMap.put(new Employee("Bob", 35), new Department("Finance"));
        employeeDepartmentMap.put(new Employee("Charlie", 28), new Department("IT"));

        // Iterating over the ConcurrentHashMap
        for (Employee emp : employeeDepartmentMap.keySet()) {
            System.out.println(emp + " works in " + employeeDepartmentMap.get(emp));
        }
    }
}
