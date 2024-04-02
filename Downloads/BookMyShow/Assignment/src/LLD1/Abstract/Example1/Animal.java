package LLD1.Abstract.Example1;

public abstract class Animal {
    //we can call non abstract constructor
    Animal(){
        System.out.println("Animal");
    }
    public abstract void sound();
}
