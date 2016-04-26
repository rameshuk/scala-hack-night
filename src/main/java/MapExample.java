package main.java;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by ramesh on 26/04/2016.
 */
public class MapExample {

    public static void main(String args[]){

        Map<Integer, String> mapValues = new HashMap<>();
        mapValues.put(1, "Red");
        mapValues.put(2, "Green");
        mapValues.put(3, "Orange");
        mapValues.put(4, "Red");
        mapValues.put(5, "Blue");
        mapValues.put(6, "Green");
        mapValues.put(7, "While");
        System.out.println(mapValues); //{1=Red, 2=Green, 3=Orange, 4=Red, 5=Blue, 6=Green, 7=While}

        //{Red=[1, 4], Blue=[5], While=[7], Orange=[3], Green=[2, 6]}

        //jdk7
        Map<String, List<Integer>> results = new HashMap<>();

        for (Map.Entry<Integer,String> entry : mapValues.entrySet()) {
            if (!results.containsKey(entry.getValue())) {
                results.put(entry.getValue(), new ArrayList<>());
            }
            List<Integer> keys = results.get(entry.getValue());
            keys.add(entry.getKey());
            results.put(entry.getValue(), keys);
        }

        System.out.println(results);

//        Map<String, Map<Integer, Map.Entry<Integer, String>>> collect = mapValues
//                .entrySet()
//                .stream()
//                .collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.toMap(Map.Entry::getKey, item -> item)));
//        System.out.println(collect);

    }
}
