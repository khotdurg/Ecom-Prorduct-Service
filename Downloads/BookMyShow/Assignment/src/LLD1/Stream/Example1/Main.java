package LLD1.Stream.Example1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date joiningDateRam = dateFormat.parse("01-01-2000");
        Date joiningDateSita = dateFormat.parse("15-05-1995");
        Date joiningDateLaxman = dateFormat.parse("10-12-1998");

        List<Employee> employees = Arrays.asList(
                new Employee("Ram", 50000, joiningDateRam, "M"),
                new Employee("Sita", 40000, joiningDateSita, "F"),
                new Employee("Laxman", 20000, joiningDateLaxman, "M")
        );

//      Employee maxSalary =  employees.stream().max((a, b)->Double.compare(a.getSalary(),b.getSalary())).get();
//      System.out.println(maxSalary);

        Employee maxSalary =  employees.stream().max(Comparator.comparingDouble(Employee::getSalary)).get();
        System.out.println(maxSalary);

    }
}
