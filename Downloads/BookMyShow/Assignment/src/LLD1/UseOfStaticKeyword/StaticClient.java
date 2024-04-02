package LLD1.UseOfStaticKeyword;

public class StaticClient {
    public static void main(String[] args) {
        Person person = new Person("Durgesh", "dk@gmail.com");
        System.out.println(Person.getPersoninfo(person));
    }
}
