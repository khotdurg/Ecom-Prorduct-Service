package LLD1.DesignPattern.Prototype.Example2;

public class Main {
    public static void main(String[] args) {
        Bird originalBird = new Bird("Chimni", "chimni@123.com", "11122232");
        System.out.println("Original Bird: " + originalBird.hashCode());

        try {
            // Cloning the original bird
            Bird clonedBird = (Bird) originalBird.clone();
            System.out.println("Cloned Bird: " + clonedBird.hashCode());

            // Modifying the cloned bird
            clonedBird.setName("AnotherName");
            clonedBird.setMail("another@example.com");
            clonedBird.setNumber("987654321");

            System.out.println("Modified Cloned Bird: " + clonedBird.hashCode());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
