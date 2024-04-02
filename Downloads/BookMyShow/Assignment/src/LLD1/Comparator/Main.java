package LLD1.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of students
        List<Student> students = new ArrayList<>();
        students.add(new Student(101, "Ovi"));
        students.add(new Student(103, "Ararddhya"));
        students.add(new Student(102, "Arnesh"));
        students.add(new Student(107, "Kanishka"));
        students.add(new Student(104, "Nakshatra"));
        students.add(new Student(106, "Kayesha"));
        students.add(new Student(105, "Calcie"));

        BMCM bms = new BMCM();

        //Acending order
        Collections.sort(students, bms);
        System.out.println("Sorted based On roll no");
        for (Student student : students) {
            System.out.println("RollNo:" + student.getRollNo() + " Name: " + student.getName());
        }
    }
}



