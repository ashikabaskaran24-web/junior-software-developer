import java.util.Scanner;
class Series
{        
    public static void main(String args[])
    {   
        Scanner s1=new Scanner(System.in);
        int n=s1.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {  
            if(i%2==0)
            {
             System.out.print(i+"-");
              sum=sum-i;
            }
            else
            {
              System.out.print(i+"+");
              sum=sum+i;
            }
        }
        System.out.println("\b="+sum);

    }  
}
