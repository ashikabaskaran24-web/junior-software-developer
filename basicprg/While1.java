import java.util.Scanner;
class While1 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        long n1= s1.nextLong();
        long b=0;
        long rem=0,sum=0;
        while(n1>0)
            {
                b=n1%10;
                sum=sum+b;
                n1=n1/10;

            }   
            System.out.println(sum);    
        }
    } 
