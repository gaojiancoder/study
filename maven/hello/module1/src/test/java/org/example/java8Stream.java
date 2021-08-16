package org.example;

import org.junit.Test;
import org.w3c.dom.css.CSSStyleDeclaration;

import java.text.Collator;
import java.util.*;
import java.util.stream.Collectors;

public class java8Stream {

    @Test
    public void filter() {
        List<String> string = Arrays.asList("asd", "asdf", "213");
        List<String> s = string.stream().filter(str -> str.contains("s")).collect(Collectors.toList());
        System.out.println(s);
    }

    @Test
    public void distinct() {
        List<String> string = Arrays.asList("asd", "asdf", "213", "213", "123123");
        List<String> collect = string.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);
        System.out.println("----------------------------");
        List<User> users = new ArrayList<>();
        users.add(new User(1, "gao"));
        users.add(new User(2, "wang"));
        users.add(new User(3, "jian"));
        users.add(new User(3, "jian"));
        List<User> collect1 = users.stream().distinct().collect(Collectors.toList());
        System.out.println(collect1);
    }

    @Test
    public void limit() {
        List<String> string = Arrays.asList("asd", "asdf", "213", "213", "123123");
        List<String> collect = string.stream().limit(2).collect(Collectors.toList());
        System.out.println(collect);
    }

    @Test
    public void skip() {
        List<String> string = Arrays.asList("asd", "asdf", "213", "213", "123123");
        List<String> collect = string.stream().skip(2).collect(Collectors.toList());
        System.out.println(collect);
    }

    @Test
    public void map() {
        List<String> string = Arrays.asList("asd", "asdf", "213", "213", "123123");
        List<String> list = string.stream().map(str -> str.concat("__heima")).collect(Collectors.toList());
        System.out.println(list);
    }

    @Test
    public void sorted() {
        List<String> string = Arrays.asList("asd", "asdf", "213", "213", "123123");
        List<String> collect = string.stream().sorted().collect(Collectors.toList());
        System.out.println(collect);
        System.out.println("----------------");
        List<String> int1 = Arrays.asList("40", "-312", "-32", "213", "123");
        List<String> collect1 = int1.stream().sorted().collect(Collectors.toList());
        System.out.println(collect1);
        System.out.println("----------");
        List<String> int2 = Arrays.asList("答复", "阿道夫", "奥", "威风", "好的");
        List<String> collect2 = int2.stream().sorted(Collator.getInstance(Locale.CHINA)).collect(Collectors.toList());
        System.out.println(collect2);

    }

    @Test
    public void findAny() {
        List<String> string = Arrays.asList("asd", "asdf", "213", "213", "123123");
        Optional<String> any = string.stream().findAny();
        System.out.println(any.get());

    }

    @Test
    public void reduce() {
        List<String> string = Arrays.asList("asd", "asdf", "213", "213", "123123");
        Optional<String> reduce = string.stream().reduce((end, item) -> {return end + item;});
        System.out.println(reduce);
    }



}