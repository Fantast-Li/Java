import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
/*
数据 添加
 */
public class jdbcDemo {
    public static void main(String[] args) throws SQLException {
        System.out.println("请输入id");
        Scanner scanner = new Scanner(System.in) ;
        int id = scanner.nextInt();
        System.out.println("请输入名字");
        String name = scanner.next();

        // 1. 创建 DateSource 对象
        MysqlDataSource dataSource = new MysqlDataSource();
        // 输入三个信息 url （标识你需要连 System.out.println("请输入id");
        //        Scanner scanner = new Scanner(System.in) ;
        //        int id = scanner.nextInt();
        //        System.out.println("请输入名字");
        //        String name = scanner.next();接那台Mysql服务器）
        //输入用户， 输入密码
        dataSource.setURL("jdbc:mysql://127.0.0.1:3306/java31?character=utf-8&useSSL=true");
        // mysql 服务器的用户名
        dataSource.setUser("root");
        //mysql 服务器密码
        dataSource.setPassword("li123456");
        //2. 创建 connection 对象
        Connection connection = dataSource.getConnection();
        //3. sql的拼接
        String sql = "insert into student values(?,?,1)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1,id);  // 参数下标从1开始
        statement.setString(2,name);
        System.out.println(statement);
        // 执行Sql 语句
        int result = statement.executeUpdate();
        System.out.println(result);
        statement.close();
        connection.close();
    }
}
