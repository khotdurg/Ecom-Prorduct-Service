package LLD1.DesignPattern.Bulder;

public class Main {
    public static void main(String[] args) {
        User user = new User.UserBuilder()
                .setUserId("123")
                .setUserName("dk@email.com")
                .build();
        System.out.println(user);
    }
}
