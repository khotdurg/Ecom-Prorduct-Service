package LLD1.HashCode.HashCodeAndOverrideEquals;

public class Student {
    private int marks;
    private String name;

    public Student(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        Student sobj = (Student) obj;
        return sobj.name.equals(this.name) && sobj.marks==this.marks;
    }

    @Override
    public int hashCode() {
        return this.marks*this.name.hashCode();
    }

    public static void main(String[] args) {
        Student s1 = new Student(10, "ABC");
        Student s2 = new Student(10, "ABC");
        System.out.println(s1.equals(s2)); //output: false even if same value

        System.out.println("Used equals: "+s1);
        System.out.println("Used equals: "+s2);

        System.out.println("Used hashcode: "+s1.hashCode());
        System.out.println("Used hashcode: "+s2.hashCode());
    }

}
