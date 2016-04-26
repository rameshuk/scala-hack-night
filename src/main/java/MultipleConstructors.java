package main.java;

/**
 * Created by ramesh on 20/04/2016.
 */
public class MultipleConstructors {

    public static void main(String args[]) {
        Person p1 = new Person("John");
        System.out.println(p1.toString());

        Person p2 = new Person("John","paul");
        System.out.println(p2.toString());

        Person p3 = new Person("John", "paul", 35);
        System.out.println(p3.toString());
    }
}

class Person {

    private String firstName;
    private String lastName;
    private Integer age;


    public Person(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName) {
        this.firstName = firstName;
        this.lastName = "";
        this.age =0;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = 0;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}