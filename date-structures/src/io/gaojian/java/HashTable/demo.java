package io.gaojian.java.HashTable;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class demo {
    public static void main(String[] args) {
        Hashtable<Object, Object> hashtable = new Hashtable<>();
        Enumeration names;
        String str;
        double bal;
        hashtable.put("jack",new Double(1232.34));
        hashtable.put("bob",new Double(622.34));
        hashtable.put("hong",new Double(32.34));
        hashtable.put("gao",new Double(432.34));

        names =hashtable.keys();
        while (names.hasMoreElements()){
            str =(String) names.nextElement();
            System.out.println(str+":"+hashtable.get(str));


//

        }
        bal = ((Double)hashtable.get("bob")).doubleValue();
        hashtable.put("bob",new Double(bal+1000));
        System.out.println(hashtable.get("bob"));

    }
}
