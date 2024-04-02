package LLD1.BasicClass;

public class Student {
    int age;
    String name;

    void display(){
        System.out.println("My name is "+ name +" I am "+age+ "Years old");
    }

    void sayHello(String s){
        System.out.println(name+ " says hello to "+ s);
    }
}
