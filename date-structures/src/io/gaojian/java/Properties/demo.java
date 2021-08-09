package io.gaojian.java.Properties;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class demo {
    public static void main(String[] args) {
        Properties capitals = new Properties();
        Set states;
        String str;
        capitals.put("Illinois","Springfield");
        capitals.put("Missouri","Jefferson City");
        capitals.put("Washington","Olymapia");
        capitals.put("California","Sacramento");
        capitals.put("Indiana","Indianapolis");

        states = capitals.keySet();
        Iterator itr = states.iterator();
        while (itr.hasNext()){
            str = (String) itr.next();
            System.out.println("the capital of:"+str+" is "+capitals.getProperty(str)+".");
        }
        System.out.println();

        str=capitals.getProperty("Indiana");
        System.out.println(str);


    }
}
