package LLD1.ExceptionHandling.Throw;

public class Client {
    public static void main(String[] args) {
        int age = 20; // Initialize age with some value
        if(age >= 18){
            throw new InvalidAgeException("Not eligible for vote");
        }
    }
}
