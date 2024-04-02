package LLD1.Constructor.ParameterisedConstructor;

public class Demo {
    int age;
    String name;

    Demo(int age, String name){
        this.age = age;
        this.name = name;
    }

    void display(){
        System.out.println("name : "+ name);
        System.out.println("age : "+ age);
    }
}
