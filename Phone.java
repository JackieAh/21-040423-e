package de.telran.akhmadullina.evgenia;
import java.util.Random;

public class Phone {
    private String number;
    public String model;
    double weight;

    protected String setNumber() {
        this.number = "+492281820000";
        return number;
    }

    public String getNumber() {
        System.out.println(number);
        return number;
    }

    double setWeight() {

        if (weight <= 0) {
            System.out.println("Error!");
        } else {
            System.out.println("Your phone's weight is: " + weight);
        }
        return weight;
    }
    static void receiveCall () {
        String caller = "Unknown";
        System.out.println("You've got a call from: " + caller);
    }
    public static boolean call () {
        String name = "Boss";
        Random Random rd = new Random();
        if (rd = true) {
            System.out.println("The following contact doesn't respond: " + name);
        } else {
            System.out.println("You've reached your contact: " + name);
        }
        return rd;
    }

    public static void main(String[] args) {
receiveCall();
call();

    }
}
