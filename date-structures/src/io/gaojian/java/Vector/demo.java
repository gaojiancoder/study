package io.gaojian.java.Vector;

import java.util.Enumeration;
import java.util.Vector;

public class demo {
    public static void main(String[] args) {
        Vector v=new Vector(3,2);
        System.out.println("initial size:"+v.size());//返回组件数
        System.out.println("initial capacity:"+v.capacity());//当前容量
        v.addElement(new Integer(1));
        v.addElement(new Integer(2));
        v.addElement(new Integer(4));
        v.addElement(new Integer(3));
        System.out.println("capacity after four additions:"+v.capacity());
        v.addElement(new Double(5.45));
        System.out.println(v.capacity());
        v.addElement(new Double(6.08));
        v.addElement(new Integer(7));
        System.out.println(v.capacity());
        v.addElement(new Integer(12));
        v.addElement(new Integer(11));
        System.out.println("first element:"+v.firstElement());
        v.addElement(new Double(18.9));//最小的数
        System.out.println("last:"+v.lastElement());//最后增加的数
        System.out.println(v.capacity());
        v.addElement(new Integer(8));
        System.out.println("last:"+v.lastElement());
        if (v.contains(new Integer(4))){
            System.out.println("Vector contains 8");
            Enumeration vEnum = v.elements();
            System.out.println("\nElements in vector");
            while (vEnum.hasMoreElements())
                System.out.println(vEnum.nextElement()+" ");
            System.out.println(v.size());
        }
    }
}
