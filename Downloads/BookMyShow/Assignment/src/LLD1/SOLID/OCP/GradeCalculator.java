package LLD1.SOLID.OCP;

public class GradeCalculator {
    public String calculateGrade(Student student){
        int marks = student.getMarks(); //extended marks from student
        if (marks >= 90) {
            return "A+";
        }
        else if (marks >= 80) {
            return "A";
        }
        else if (marks >= 70) {
            return "B";
        }
        else if (marks >= 60) {
            return "C";
        }
        else {
            return "D";
        }
    }
}
