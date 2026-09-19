package databasework;
import java.sql.*;
public class Pgm1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");//loads the mysql in javaprg
			 System.out.println("driver accepted");
			 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jsd", "root", "Ashi");
			 System.out.println("connection success");
			 Statement st=con.createStatement();//by st sql query is used a code
			 ResultSet rs=st.executeQuery("select *from Student");
			 while(rs.next())
			 {
				 System.out.println(rs.getString(1)+ " "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			 }
			 rs.close(); st.close(); con.close();
		}
       catch(Exception e)
		{
    	   System.out.println("error msg:"+e.toString());
		}
	}

}
