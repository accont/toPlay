package test;

import org.springframework.util.StringUtils;

import java.sql.*;

/**
 * Created by admin on 2016/3/25.
 */
public class Tttttt {
    public  static void main(String[] args){
        String url = "jdbc:mysql://localhost/blog";
        String user = "root";
        String password = "root";
        PreparedStatement ps = null;
        String a = null ;
        if (1==1){

            System.out.println("====="+StringUtils.isEmpty(a));
        }
      //  Statement statement = null;
        ResultSet resultSet = null;
      //  ResultSetMetaData metaData = null;
        try {
            Connection connection =  DriverManager.getConnection(url, user, password);
            String sql = "select * from t_sys_user ";
            ps =  connection.prepareStatement(sql);
            resultSet = ps.executeQuery();
            int col =  resultSet.getRow();
           // statement = connection.createStatement();
            //   int b = statement.executeUpdate(sql);
           // int i  = ps.executeUpdate();
          //  int col = metaData.getColumnCount();
          //  System.out.println("=====");
          //  while (resultSet.next()){
            /*    for (int i = 1 ; i < col ; i++){
                    System.out.println("=====");
                    System.out.print("2222222222222"+resultSet.getArray(i));
                    System.out.print("\t\t");
                }*/
           // }
           /* if (b > 0){
              //  System.out.println(rs.toString());
                System.out.println("ok");
            }*/

          //  System.out.print("col :"+resultSet.getCursorName());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        finally {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
           /* try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }*/
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
