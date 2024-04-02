package LLD1.ConcurrentHashMap.Example2;

public class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and setters (omitted for brevity)

    @Override
    public String toString() {
        return name + " (Age: " + age + ")";
    }
}
