package de.telran.akhmadullina.evgenia;
import java.util.Random;

public class Person {
    public static String fullName;
    private final int age = 21;

    public int getAge() {
        return age;
    }

    static void talk() {
        System.out.println("This person says something");
    }
static Random move() {
        Random random = new Random();
    int upperbound = 100;
    return random;
}
public Person (String fullName, int age) {
        Person.fullName = fullName;
    System.out.println("Hi, I'm a person 1!");
}

public Person () {
    System.out.println("Hi, I'm a person 2!");
}

    public static void main(String[] args) {
        talk();
        Person personOne = new Person(fullName, 21);
        Person personTwo = new Person();

    }
}

