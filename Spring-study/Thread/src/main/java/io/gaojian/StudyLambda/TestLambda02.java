package io.gaojian.StudyLambda;

public class TestLambda02 {
    public static void main(String[] args) {
 ILove love =s->System.out.println("I louve"+s );
        love.love("高健");
    }
}

interface ILove{
    void love(String s);
}

