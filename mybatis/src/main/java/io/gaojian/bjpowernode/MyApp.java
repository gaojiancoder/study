package io.gaojian.bjpowernode;

import io.gaojian.bjpowernode.domain.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyApp {
    public static void main(String[] args) throws IOException {
        //访问mybatis读取student数据
        //1定义mybatis主配置文件的名称,从类路径的根开始(target/classes)
        String config = "mybatis.xml";
        //2读取这个config文件
        InputStream in = Resources.getResourceAsStream(config);
        //3创建sqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        //4创建SqlSessionFactory对象
        SqlSessionFactory factory = builder.build(in);
        //5获取对象从qlSessionFactory中(重要)
        SqlSession sqlSession =factory.openSession();
        //6指定要执行的sql语句的标识  标签的id值
        String sqlId = "insertStudent";
        //7执行sql语句，通过sqlId找到语句
        List<Student> studentList = sqlSession.selectList();
        //8输出结果
        studentList.forEach(student -> System.out.println(student));
        //9关闭sqlsession对象
        sqlSession.close();

    }
}
