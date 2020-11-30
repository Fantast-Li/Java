

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class jdbcDemo2 {
    /*
    jdbc 的修改 操作  jdbc:mysql://127.0.0.1:3306/java31?character=utf-8&useSSL=tru
     */
    public static void main(String[] args) throws SQLException {
        System.out.println("请输入要修改的id");
        Scanner scanner = new Scanner(System.in) ;
        int id = scanner.nextInt();
        System.out.println("请输入修改后的名字");
        String name = scanner.next();


        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setURL("jdbc:mysql://127.0.0.1:3306/java31?character=utf-8&useSSL=true");
        dataSource.setUser("root");
        dataSource.setPassword("li123456");
        Connection connection = dataSource.getConnection();
        String sql = "update student set name = ? where id = ?" ;
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1,name);
        statement.setInt(2,id);
        System.out.println(statement);
        int result = statement.executeUpdate();
        System.out.println(result);
        statement.close();
        connection.close();
    }
}
