import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int n=s1.nextInt();
        int sum=0;
        for( int i=1;i<=n;i++)
        {   System.out.print(i);
            sum=sum+i;
            if(n==i)
                break;
            System.out.print("+");
        }
        System.out.println("="+sum);  
    }   
}