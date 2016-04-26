package main.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ramesh on 26/04/2016.
 */
public class PatternMatching {

    public static void main(String args[]) {

        Object[] list = new Object[]{1, 2, 2.7, "one", "two", "four"};

        for (Object obj : list) {
            if (obj instanceof Integer && (Integer) obj == 1) {
                System.out.println("int 1");
            } else if (obj instanceof Integer) {
                System.out.println("other int: " + obj);
            } else if (obj instanceof Double) {
                System.out.println("a double: " + obj);
            } else if (obj instanceof String && ("one".equals(obj))) {
                System.out.println("string one");
            } else if (obj instanceof String) {
                System.out.println("other string: " + obj);
            } else {
                System.out.println("unexpected value: " + obj);
            }
        }


    }
}
