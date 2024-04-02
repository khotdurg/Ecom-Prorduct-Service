package LLD1.ExceptionHandling.Finally;

public class Client {
    public static void main(String args[]) {

        try {
            //below code throws divide by zero exception
            int data = 25 / 0;
            System.out.println(data);
        }

        //handles the Arithmetic Exception / Divide by zero exception
        catch (ArithmeticException e) {
            System.out.println(e);
        }

        //executes regardless of exception occurred or not
        finally {
            System.out.println("finally block is always executed");
        }
    }
}
