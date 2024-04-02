package LLD1.UseOfStaticKeyword;

public class Person {
    String name;
    String email;

    public Person(String name, String email){
        this.name = name;
        this.email = email;
    }

    public static String getPersoninfo(Person person){
        return person.name+ " "+ person.email;
    }
}
