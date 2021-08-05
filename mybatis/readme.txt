mybatis:第一个入门mybatis案例

实现步骤：
1.新建student表
2.加入maven的mybatis坐标，mybatis驱动坐标
3.创建实体类，Student--保存表中的一行数据
4.创建持久层的dap接口，定义操作数据库的方法
5.创建mybatis使用的配置文件
    叫做sql映射文件：写SQL语句的，一般一个表就一个sql映射文件
    这个文件是xml文件，
    文件写在接口所在的目录中
    文件名与接口保持一致
6.创建mybatis的主配置文件
    一个项目就一个主配置文件。
    主配置文件提供了数据看看的连接信息和sql映射文件的位置信息
7.创建使用mybatis类
    通过mybatis访问数据库