package dev.durgesh.SpringBoot.App;

public class Person {
    int id;
    String name;
    int age;

    //CONSTRUCTOR
    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString() {
        return id+" "+ name + " " + age;
    }
}
