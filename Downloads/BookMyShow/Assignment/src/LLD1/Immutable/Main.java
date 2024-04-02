package LLD1.Immutable;

public class Main {
    public static void main(String[] args) {

        Student student = new Student(1,"Durgesh" ); //instance
        System.out.println(student.getId()+": "+ student.getName());

        Student student1 = new Student(2,"Rahul" ); //instance
        System.out.println(student1.getId()+": "+student1.getName());


        System.out.println(student.hashCode()+": "+ student1.hashCode());

    }
}
