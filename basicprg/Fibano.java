import java.util.Scanner;
class Fibano
{        
    public static void main(String args[])
    {   
        Scanner s1=new Scanner(System.in);
        int n=s1.nextInt();
        int a=0;
        int b=1;
        for(int i=0;i<=n;i++)
        {     
            int c=a+b;
             System.out.println(a);
             a=b;
             b=c;
        }

    }  
}
