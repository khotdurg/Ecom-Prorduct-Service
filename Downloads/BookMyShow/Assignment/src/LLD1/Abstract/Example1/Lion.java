package LLD1.Abstract.Example1;

public class Lion extends Animal{
    Lion(){
        super(); // to call constructor of Animal
    }
    @Override
    public void sound() {
        System.out.println("Lion is Roaring");
    }
}
