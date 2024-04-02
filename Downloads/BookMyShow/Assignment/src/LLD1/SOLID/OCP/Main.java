package LLD1.SOLID.OCP;

public class Main {
    public static void main(String[] args) {
        //Creating instance of students
        Student s1 = new Student("Durgesh", 95);
        Student s2 = new Student("Dk", 75);

        //calculating grade using grade calculator
        GradeCalculator calculator = new GradeCalculator();
        String grade1 = calculator.calculateGrade(s1);
        String grade2 = calculator.calculateGrade(s2);

        //displaying grades
        System.out.println(s1.getName() + "'s Grade: " + grade1);
        System.out.println(s2.getName() + "'s Grade: " + grade2);    }
}
