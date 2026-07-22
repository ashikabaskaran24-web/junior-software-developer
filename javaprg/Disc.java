import java.util.Scanner;
class Disc {
    public static void main(String args[])
    {
    Scanner s1=new Scanner(System.in);
    int amo=s1.nextInt();
    if(amo<=999)
    {
        System.out.println("no discount");
    }
    else if(amo>=1000 && amo<=1999)
    {
        System.out.println(amo*5/100);
    }
    else if(amo>=2000 && amo<=3999)
    {
        System.out.println(amo*7/100);
    }
    else if(amo>=4000 && amo<=6000)
    {
        System.out.println(amo*8/100);
    }
    else
    {
    
        System.out.println(amo*10/100);
    }
    }

}


