package Stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
Streams streams =new Streams();
streams.map();

    }













    private Integer[] array={10,3,3,15,9,23};
    private void map(){
        List<Integer> collect = Stream.of(array).map(n->n*2).collect(Collectors.toList());
        System.out.println(collect);
        List<Integer> collect1 = Stream.of(array).mapToInt(n->n*3).boxed().collect(Collectors.toList());
        System.out.println(collect1);
    }
}