package databasework;
import java.sql.*;
import java.util.Scanner;
public class Pgm2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1= new Scanner(System.in);
		System.out.println("enter rollno name mark grade");
		int roll_no=s1.nextInt();
		String name=s1.next();
		int mark=s1.nextInt();
		String result=s1.next();
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			 System.out.println("driver accepted");
			 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jsd", "root", "Ashi");
			 System.out.println("connection success");
			 Statement st=con.createStatement();
			 int res = st.executeUpdate(
					    "insert into student values("+roll_no+",'"+name+"',"+mark+",'"+result+"')");
			 if(res==1) {
				 System.out.println("inserted");
			 }
			 else
			 {
				 System.out.println("not inserted");
			 }
			 
		}
       catch(Exception e)
		{
    	   System.out.println("error msg:"+e.toString());
		}
	}

}
