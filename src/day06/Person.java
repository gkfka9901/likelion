package day06;

public class Person {
    private String name;
    private int age;
    private String phoneNumber;

    public Person(String name) {
        this.name = name;
    }

    public Person(int age, String phoneNumber){
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public Person(String name, int age, String phoneNumber) {
        this(name);

    }
}
