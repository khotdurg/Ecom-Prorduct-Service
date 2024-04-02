package LLD1.BasicClass;

public class StudentClient {
    public static void main(String[] args) {
        Student student = new Student(); // if we want to pass the values inside the braces we can,
        // but we must need a constructor to pass the data and fetch the data
        student.display();
        student.sayHello(student.name);
    }
}
