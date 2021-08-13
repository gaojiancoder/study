package io.gaojian.StudyLambda;

/**
 * 推到lambda表达式
 */
public class TestLambda01 {
    public static void main(String[] args) {
        Ilike like =()->System.out.println("🍚");
        like.lambda();
    }

    //1定义一个函数式接口
    interface Ilike{
        void lambda();
    }


}
