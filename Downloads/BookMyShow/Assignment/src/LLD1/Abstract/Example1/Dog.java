package LLD1.Abstract.Example1;

public class Dog extends Animal{
    Dog(){
        super(); // to call constructor of animal
    }
    @Override
    public void sound() {
        System.out.println("Dog is Barking");
    }
}
