package io.gaojian;
import io.gaojian.pojo.Prople;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
@Test
    public void test1(){
    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    Prople prople = context.getBean("prople",Prople.class);
    prople.getCat().shout();
    prople.getDog().shout();
    System.out.println( prople.getName());
}
}
