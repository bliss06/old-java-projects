package javaworkshop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MyMap {
    public static void main(String[] args) {
        Map map = new HashMap<>();

        map.put("name", "Kristen");
        map.put("Family name", "Larsen");
        map.put("address", "Jumping rd");
        map.put("color", "Red");
        map.put("pin code", "555555555");

        System.out.println(map);
        
        //TreeMap is a sorted Map
        TreeMap tmap = new TreeMap<>();

        tmap.putAll(map);

        System.out.println(tmap);
    }
}
