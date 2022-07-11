package com.example.StreamAPI.MapSort;

import java.util.HashMap;
import java.util.Map;

public class SortingMap {

    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("madhav",600);
        map.put("anand",200);

        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
    }
}
