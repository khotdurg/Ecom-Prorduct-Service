package LLD1.Inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();//by parent class we cannot call child class
        animal.eat();

        Dog dog = new Dog();
        dog.eat();
        dog.breed();
    }
}
