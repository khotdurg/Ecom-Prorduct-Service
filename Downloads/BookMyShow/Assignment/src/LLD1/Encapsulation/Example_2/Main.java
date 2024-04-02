package LLD1.Encapsulation.Example_2;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Arnesh");
        person.setAge(3);
        System.out.println("Name: "+person.getName());
        System.out.println("Age: "+ person.getAge());
        System.out.println(person);

    }
}
