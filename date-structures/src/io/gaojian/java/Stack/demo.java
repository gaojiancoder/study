package io.gaojian.java.Stack;

import java.lang.invoke.StringConcatException;
import java.util.EmptyStackException;
import java.util.Stack;

public class demo {

    static void showpush(Stack<Integer>st,int a){
        st.push(new Integer(a));
        System.out.println("push("+a+")");
        System.out.println("stack:"+st);
    }
    static void showopp(Stack<Integer>st){
        System.out.println("pop-->");
        Integer a=st.pop();
        System.out.println(a);
        System.out.println("stack:"+st);
    }

    public static void main(String[] args) {
    Stack<Integer>st=new Stack<Integer>();//创建一个名为st的栈
        System.out.println("stack"+st);
        showpush(st,42);
        showpush(st,66);
        showpush(st,88);
        showopp(st);
        showopp(st);
        showopp(st);
        try {
            showopp(st);
        }catch (EmptyStackException e){
            System.out.println("empty stack");
        }

    }
}