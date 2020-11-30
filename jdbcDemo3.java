import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbcDemo3 {
    /*
    jdbc 查询语句
     */
    public static void main(String[] args) throws SQLException {
        MysqlDataSource dataSource = new MysqlDataSource() ;
        dataSource.setURL("jdbc:mysql://127.0.0.1:3306/java31?character=utf-8&useSSL=true");
        dataSource.setUser("root");
        dataSource.setPassword("li123456");
        Connection connection = dataSource.getConnection();
        String sql = "select * from student" ;
        PreparedStatement statement = connection.prepareStatement(sql) ;
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            System.out.println("ID: "+resultSet.getInt("id")+"Name: "+resultSet.getString("name")+
                    "class_id: "+resultSet.getInt("class_id"));
        }
        resultSet.close();
        statement.close();
        connection.close();

    }
}
