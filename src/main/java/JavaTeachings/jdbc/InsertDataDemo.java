package JavaTeachings.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertDataDemo {
    public static void main(String[] args) throws Exception{
        String dburl ="jdbc:mysql://localhost:3306/fi_serv_training";
        String dbUserName="root";
        String dbPassword ="V@shi0807";
        String sql_query="insert into fiservbatch2 values(102,'Arun',60000,'Bangalore'),(103,'Gayatri',70000,'Pune')";

        Connection con =  DriverManager.getConnection(dburl,dbUserName,dbPassword);
        Statement st = con.createStatement();
        int i = st.executeUpdate(sql_query);
        System.out.println("Insertion is completed for "+i+" rows");
        con.close();
    }
}
