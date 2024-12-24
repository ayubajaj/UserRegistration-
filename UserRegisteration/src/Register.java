import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Register {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//import package
//load and register
//create connection
//create statement
//execute statement
//process the result
//close connection
//
    String url="jdbc:postgresql://localhost:5432/Register";
    String user="postgres";
    String password="123456";
        //loading driver
        Class.forName("org.postgresql.Driver");
        Connection con=DriverManager.getConnection(url,user,password);
             System.out.println("connection stablished");
            ArrayList<String>data=new ArrayList<>(Arrays.asList("ayubajaj06@gmail.com","Abcxyz@01"));
        ArrayList<String>data1=new ArrayList<>(Arrays.asList("ayubajaj06@gmail.com","Abcxyz@02"));
        Statement st=con.createStatement();


             addData(data,con);
//             updateData(ArrayList<String>data1,con);
//             getData(con);
        con.close();






    }
    public static void addData(ArrayList<String>data,Connection con) throws SQLException {
        String sql="insert into users values ('ab8', 'ag')";
        Statement st=con.createStatement();
       System.out.println( st.executeQuery(sql));


    }

}
