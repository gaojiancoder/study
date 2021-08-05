package cn.itcast.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcDemo01 {
    public static void main(String[] args) throws  SQLException {
        //1导入jar包
        //2注册驱动
        //3获取数据库的连接对象
        Connection coon = DriverManager.getConnection("jdbc:mysql://localhost:9999/bank","root","12345678");
        String sql ="update user set bank = 500 where id =1";
        Statement stmt = coon.createStatement();
        int i = stmt.executeUpdate(sql);
        System.out.println(i);
        coon.close();
        stmt.close();

    }

}
