package cn.itcast.jdbc;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbc01 {
    public static void main(String[] args) {
        try {
            //注册驱动
            Driver driver = new  com.mysql.jdbc.Driver();
            DriverManager.registerDriver(driver);
            //获取连接
            String url="jdbc:mysql://localhost:3306/bank user=root&password=12345678";

//            String user = "root";
//            String password ="12345678";
            Connection conn= DriverManager.getConnection(url);
            System.out.println("数据库连接对象=" +conn );

        }catch (SQLException e){
            e.printStackTrace();
        }


    }
}
