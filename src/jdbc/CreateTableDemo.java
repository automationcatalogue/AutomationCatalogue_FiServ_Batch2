package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableDemo {
    public static void main(String[] args) throws SQLException {
        String dburl = "jdbc:mysql://localhost:3306/fi_serv_training";
        String dbusername="root";
        String dbpassword ="V@shi0807";
        String sql_query ="create table fiservbatch2(empNo int, empName varchar(20), empSal int, empAddr varchar(20))";

        Connection con = DriverManager.getConnection(dburl,dbusername, dbpassword);
        Statement st = con.createStatement();
        int i=st.executeUpdate(sql_query);
        System.out.println("Table is crated with "+i+" rows");
        con.close();
    }
}
