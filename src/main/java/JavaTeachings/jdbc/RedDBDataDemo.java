package JavaTeachings.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RedDBDataDemo {
    public static void main(String[] args)  throws  Exception{
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fi_serv_training","root","V@shi0807");
        Statement st =con.createStatement();
        ResultSet rs = st.executeQuery("select * from fiservbatch2");

        while (rs.next()){
            String s1=rs.getString(1);
            String s2=rs.getString("empName");
            String s3=rs.getString(3);
            System.out.println(s1+" "+s2+" "+s3);
        }
        con.close();

    }
}
