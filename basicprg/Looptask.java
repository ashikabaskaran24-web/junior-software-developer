import java.util.Scanner;
public class Looptask {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int n=s1.nextInt();
        for( int i=1;i<=n;i++)
        {   
            System.out.print(i);
            if(n==i)
                break;
            System.out.print("+");
        }
        
    }
    
}//or we can also using /b
