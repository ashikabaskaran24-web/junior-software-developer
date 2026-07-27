
import java.util.Scanner;
class Table
{
    public static void main(String args[])
    {
        Scanner s1=new Scanner(System.in);
        int n=s1.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(i+"*"+n+"="+i*n);
        }
    }
}