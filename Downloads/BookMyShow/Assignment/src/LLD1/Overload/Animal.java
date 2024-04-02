package LLD1.Overload;

public class Animal {
    public static void eat(){ //static method can overload
        System.out.println("having meal");
    }

    public static void eat(String name){ //static method can overload
        System.out.println("tiger"+ name);
    }

    public static void main(String[] args) {
        Animal.eat(); //we dont need object when used static we can directly call class name and method
        Animal.eat(" dog");

    }
}
