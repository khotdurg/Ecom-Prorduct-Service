package LLD1.polymorphism.OverLoading;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.printUser(); // this will call non parameterised method
        user.printUser("Durgesh", "dk@gmail.com", 30);// will call parameterised method
    }
}
