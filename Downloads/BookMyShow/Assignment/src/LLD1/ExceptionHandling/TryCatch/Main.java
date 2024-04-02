package LLD1.ExceptionHandling.TryCatch;

public class Main {
    public static void main(String[] args) {
        int a =10, b=0, c;

        try{
            c= a/b;
            System.out.println(c);
        }
        catch (Exception e) {
            System.out.println(e); // for checked exception name
        }
        System.out.println("main method ended");
    }
}
