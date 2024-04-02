package LLD1.polymorphism.OverLoading;

public class User {
    private String name;
    private String email;

    public void printUser(){
        System.out.println("Name:"+name+ ", Email:"+email);
    }
    public void printUser(String name, String email, int age){ //its up to us whether add extra data or not
        System.out.println("Name:"+name+ ", Email:"+email + " age: " +age);

    }
}
