package io.gaojian.StudyLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 推到lambda表达式
 */
public class TestLambda01 {

    public static void main(String[] args) {
        Ilike like = () -> System.out.println("🍚");
        like.lambda();

        List<Integer> data = new ArrayList<>();
        data.add(1);
        data.add(2);
        data.add(3);
        for (int i = 0; i < data.size(); i++) {
            System.out.println(data.get(i));
        }
        System.out.println("---------------");
        data.stream().forEach(System.out::println);
        System.out.println("----------------");
        List<Integer> data2 = data.stream()
                .map(e -> e + 1).collect(Collectors.toList());
        for (Integer d : data2) {
            System.out.println(d);
        }

        boolean b = data.stream().anyMatch(e -> e > 2);
        System.out.println(b);
        boolean b2 = data.stream().allMatch(e -> e >= 2);
        System.out.println(b2);

        Integer[] array = {10, 3, 3, 15, 9, 23};
//        Stream.of(array).mapToLong(Integer::longValue);
        Stream.of(array).mapToLong(Integer::longValue);


    }

    //1定义一个函数式接口
    interface Ilike{
        void lambda();
    }


}
