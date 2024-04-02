package LLD1.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // List of Employee objects
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Anil", 34));
        employees.add(new Employee("Kishor", 35));
        employees.add(new Employee("Durgesh", 30));

        Collections.sort(employees);
        System.out.println("Sorted by age");
        for(Employee employee: employees){
            System.out.println(employee.getName()+": "+ employee.getAge());
        }
    }
}
