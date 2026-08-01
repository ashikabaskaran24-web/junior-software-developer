import java.util.Scanner;
class Revdigit {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        long n1= s1.nextLong();
        long b=0;
        long rem=0,sum=0;
        while(n1>0)
            {
                b=n1%10;//4321
                rem=rem*10+b;//0+4 40+3 430+2 4320+1 4321 then n condition is false
                n1=n1/10;
            } 
            System.out.println(rem);     
        }
    } 
