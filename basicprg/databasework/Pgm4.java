package databasework;

import java.sql.*;
import java.util.Scanner;

public class Pgm4 {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);

        System.out.println("enter rollno,name,mark:");

        int roll_no = s1.nextInt();
        String name = s1.next();
        int mark = s1.nextInt();

        String result = " ";

        if (mark > 34) {
            result = "pass";
        } else {
            result = "fail";
        }

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("driver accepted");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/jsd",
                "root",
                "Ashi"
            );

            System.out.println("connection success");

            Statement st = con.createStatement();

            int res = st.executeUpdate(
                "update student set name='" + name +
                "', mark=" + mark +
                ", result='" + result +
                "' where roll_no=" + roll_no
            );

            if (res == 1) {
                System.out.println("updated");
            } else {
                System.out.println("not updated");
            }

        } catch (Exception e) {
            System.out.println("error msg:" + e.toString());
        }
    }
}