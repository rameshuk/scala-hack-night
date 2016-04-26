package main.java;

/**
 * Created by ramesh on 20/04/2016.
 */

public class Excercise2 {
    private final String name;

    public Excercise2(String name) {
        System.out.println("New instance with name: " + name);
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String args[]) {
        System.out.println(new Excercise2("Ramesh"));

    }
}