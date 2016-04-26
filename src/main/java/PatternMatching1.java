package main.java;

/**
 * Created by ramesh on 20/04/2016.
 */
public class PatternMatching1 {

    public static void main(String args[]) {
        System.out.println(fact(6));

    }

    public static Integer fact(Integer x) {
        if (x == 0)
            return 1;
        else
            return x * fact(x - 1);
    }
}
