package io.gaojian.java.Map.HashMap;

import java.util.HashMap;

public class demo {
    public static void main(String[] args) {
        HashMap<Integer,String > map = new HashMap<>();
        map.put(1,"gao");
        map.put(2,"han");
        map.put(3,"wang");
        map.put(4,"jian");
        for (Integer i:map.keySet()
             ) {
            System.out.println(map.get(i));

        }

    }
}
