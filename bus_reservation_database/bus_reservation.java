import java.sql.*;
public class bus_reservation
{
    public static void main(String args[])
    {
        String url="jdbc:mysql://localhost:3306/employeejava";
        String username="root";
        String password="Ashi";
        String query="select *from employee";
        Connection con =DriverManager.getConnection(url,username,password);
        Statement st=con.createStatement();
        ResultSet rs= st.executeQuery(query);
        rs.next();
        System.out.println(rs.getInt(1));
         System.out.println(rs.getInt(2));
          System.out.println(rs.getInt(3));
          con.close();  
    }
}