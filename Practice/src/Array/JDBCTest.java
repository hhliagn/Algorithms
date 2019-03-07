package Array;

import java.sql.*;

public class JDBCTest {
    public static void main(String[] args) {

        Connection connection=null;
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection=DriverManager.getConnection("jdbc:mysql//202.38.235.8:3306/db_test","root","123456");

            String sql="select * from t_test";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                String name = resultSet.getString("name");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if(connection!=null){
                    connection.close();
                }
                if(preparedStatement!=null){
                    preparedStatement.close();
                }
                if(resultSet!=null){
                    resultSet.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
