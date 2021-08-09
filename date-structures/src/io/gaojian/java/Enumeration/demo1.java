package io.gaojian.java.Enumeration;

import java.util.Enumeration;
import java.util.Vector;

public class demo1 {
    public static void main(String[] args) {
        Enumeration<String> days;
        Vector<String> dayName = new Vector<>();
        dayName.add("student");
        dayName.add("Monday");
        dayName.add("Tuesday");
        dayName.add("Wednesday");
        dayName.add("Thursday");
        days=dayName.elements();
        while (days.hasMoreElements()){
            System.out.println(days.nextElement());
        }
    }
}
