package databasework;
import java.sql.*;
import java.util.Scanner;
public class Pgm3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1= new Scanner(System.in);
		System.out.println("enter rollno:");
		int roll_no=s1.nextInt();
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			 System.out.println("driver accepted");
			 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jsd", "root", "Ashi");
			 System.out.println("connection success");
			 Statement st=con.createStatement();
			 int res = st.executeUpdate("delete from student where roll_no="+roll_no);
			 if(res==1) {
				 System.out.println("deleted");
			 }
			 else
			 {
				 System.out.println("not found");
			 }
			 
		}
       catch(Exception e)
		{
    	   System.out.println("error msg:"+e.toString());
		}
	}

}
