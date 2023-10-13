package JavaTeachings.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ExecuteDemo {
    public static void main(String[] args) throws Exception{
        String dburl="jdbc:mysql://localhost:3306/fi_serv_training";
        String dbUserName="root";
        String dbPassword="V@shi0807";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your SQL Query");
        String sql_query=sc.nextLine();
        System.out.println(sql_query);

        Connection con= DriverManager.getConnection(dburl, dbUserName, dbPassword);
        Statement st =con.createStatement();

        boolean b=st.execute(sql_query);
        if(b){
            System.out.println("Select query is executed");
            ResultSet rs =st.getResultSet();
            while(rs.next()){
                System.out.println(rs.getString(1)+" "+rs.getString(2));
            }
        }else{
            System.out.println("Non-Select query is executed");
            int rowCount=st.getUpdateCount();
            System.out.println("The number of records effected is :"+rowCount);
        }

        con.close();

    }
}
