import java.util.Scanner;
class Lastname1 {
    public static void main(String args[])
    {
        Scanner s1=new Scanner(System.in);
        String n1=s1.next();
        int len=n1.length();
        int dec=len-1;
        for(int i=0;i<len/2;i++)
        {
             System.out.print(n1.charAt(i)+""+n1.charAt(dec--));
            }

        }
    }