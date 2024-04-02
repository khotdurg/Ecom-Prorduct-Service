package LLD1.ExceptionHandling.FinaliseMethod;

public class Client extends Object {

    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("Inside Client's finalize() method");
        } catch (Throwable e) {
            throw e;
        } finally {
            // Call finalize() of Object class
            super.finalize();
        }
    }

    public static void main(String[] args) throws Throwable {
        // Creating demo's object
        Client client = new Client();

        // Calling finalize of demo
        client.finalize();
    }
}
