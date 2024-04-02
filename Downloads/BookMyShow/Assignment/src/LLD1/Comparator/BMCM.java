package LLD1.Comparator;

import java.util.Comparator;

public class BMCM implements Comparator<Student> { //in angular braces what we want to sort that data type to be filled

    int rollNo;
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getRollNo() - s2.getRollNo();// ascending order sort
    }
}
