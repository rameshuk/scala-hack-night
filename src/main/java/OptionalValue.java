package main.java;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ramesh on 21/04/2016.
 */
public class OptionalValue {

    public static void main(String args[]) {
    Map<String, String> capitalCities = new HashMap<>();
        capitalCities.put("France","Paris");
        capitalCities.put("Japan","Tokyo");

        String capitalOfUk= capitalCities.get("UK");

        System.out.println("Capital city of UK is :" + capitalOfUk);
        System.out.println("String length of capital city: "+ capitalOfUk.length());

    }
}
