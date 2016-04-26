package main.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ramesh on 26/04/2016.
 */
public class Yield {

    //find even numbers which is greater than 10 from range 0 to 20 integers

    public static void main(String args[]){
        List<Integer> evenNumbers = new ArrayList<>(10);

        for(int i =0;i <20 ;i++) {
            if(i%2==0 && i <10){
                evenNumbers.add(i);
            }
        }

        System.out.println(evenNumbers);
    }
}
