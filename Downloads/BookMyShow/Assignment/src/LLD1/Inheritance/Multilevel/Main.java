package LLD1.Inheritance.Multilevel;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat(); //here in Animal class make public eat to call eat behaviour
        cat.sound();
        cat.bread();
    }
}
