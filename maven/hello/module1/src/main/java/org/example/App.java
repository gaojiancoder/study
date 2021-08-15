package org.example;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args){
        test t = new test();
        t.map();

    }

    static class test{
        private Integer[] array = {10,3,3,15,9,23};

        private void map(){
            List<Integer> collect = Stream.of(array).map(n -> n*2).collect(Collectors.toList());
            System.out.println(collect);
        }
    }





}
